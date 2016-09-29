/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.dbmodel.mutator;


import com.speedment.common.dbmodel.ForeignKey;
import com.speedment.common.dbmodel.ForeignKeyColumn;
import com.speedment.common.dbmodel.mutator.trait.HasEnabledMutator;
import com.speedment.common.dbmodel.mutator.trait.HasNameMutator;
import com.speedment.common.dbmodel.internal.ForeignKeyColumnImpl;
import static com.speedment.common.dbmodel.ForeignKey.FOREIGN_KEY_COLUMNS;
import static com.speedment.common.dbmodel.util.DocumentUtil.newDocument;

/**
 *
 * @author       Per Minborg
 * @param <DOC>  document type
 */

public class ForeignKeyMutator<DOC extends ForeignKey> extends DocumentMutatorImpl<DOC> implements 
        HasEnabledMutator<DOC>, 
        HasNameMutator<DOC> {

    public ForeignKeyMutator(DOC foreignKey) {
        super(foreignKey);
    }

    public ForeignKeyColumn addNewForeignKeyColumn() {
        return new ForeignKeyColumnImpl(document(), newDocument(document(), FOREIGN_KEY_COLUMNS));
    }
}