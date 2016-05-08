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
package com.speedment.runtime.internal.core.config.db;

import com.speedment.runtime.config.db.Column;
import com.speedment.runtime.config.db.ForeignKey;
import com.speedment.runtime.config.db.Index;
import com.speedment.runtime.config.db.PrimaryKeyColumn;
import com.speedment.runtime.config.db.Schema;
import com.speedment.runtime.config.db.Table;
import com.speedment.runtime.internal.core.config.AbstractChildDocument;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author Emil Forslund
 */
public final class TableImpl extends AbstractChildDocument<Schema> implements Table {

    public TableImpl(Schema parent, Map<String, Object> data) {
        super(parent, data);
    }

    @Override
    public Stream<? extends Column> columns() {
        return children(COLUMNS, ColumnImpl::new);
    }

    @Override
    public Stream<? extends Index> indexes() {
        return children(INDEXES, IndexImpl::new);
    }

    @Override
    public Stream<? extends ForeignKey> foreignKeys() {
        return children(FOREIGN_KEYS, ForeignKeyImpl::new);
    }

    @Override
    public Stream<? extends PrimaryKeyColumn> primaryKeyColumns() {
        return children(PRIMARY_KEY_COLUMNS, PrimaryKeyColumnImpl::new);
    }
}