/*
 *  Copyright (C) 2010-2015 JPEXS
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.gui;

import com.jpexs.helpers.Helper;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JPEXS
 */
public class TagInfoPanel extends JPanel {

    private final JLabel neededCharactersLabel;

    public TagInfoPanel() {
        neededCharactersLabel = new JLabel();
        add(new JLabel("Needed characters:"));
        add(neededCharactersLabel);

        // todo: add other information
    }

    public void setNeededCharacters(Set<Integer> needed) {
        String neededStr = Helper.joinStrings(needed, ", ");
        neededCharactersLabel.setText(neededStr);
    }
}
