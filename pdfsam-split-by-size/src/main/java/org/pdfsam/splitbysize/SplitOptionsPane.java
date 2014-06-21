/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 08/apr/2014
 * Copyright 2013-2014 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.splitbysize;

import java.util.function.Consumer;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import org.pdfsam.context.DefaultI18nContext;
import org.pdfsam.ui.support.Style;
import org.sejda.model.parameter.SplitBySizeParameters;

/**
 * Panel for the Split options
 * 
 * @author Andrea Vacondio
 *
 */
class SplitOptionsPane extends HBox {

    private SizeComboBox combo = new SizeComboBox();

    SplitOptionsPane() {
        super(5);
        getStyleClass().addAll(Style.CONTAINER.css());
        setAlignment(Pos.BOTTOM_LEFT);
        getChildren().addAll(new Label(DefaultI18nContext.getInstance().i18n("Split at this size:")), combo);
    }

    SplitBySizeParameters createParams(Consumer<String> onError) {
        return combo.createParams(onError);

    }
}