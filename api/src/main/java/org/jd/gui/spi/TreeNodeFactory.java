/*
 * Copyright (c) 2008-2019 Emmanuel Dupuy.
 * This project is distributed under the GPLv3 license.
 * This is a Copyleft license that gives the user the right to use,
 * copy and modify the code freely for non-commercial purposes.
 */

package org.jd.gui.spi;

import javax.swing.tree.DefaultMutableTreeNode;

import org.jd.gui.api.API;
import org.jd.gui.api.feature.ContainerEntryGettable;
import org.jd.gui.api.feature.UriGettable;
import org.jd.gui.api.model.Container;

import java.util.regex.Pattern;

public interface TreeNodeFactory {
	public String[] getSelectors();

    public Pattern getPathPattern();

	public <T extends DefaultMutableTreeNode & ContainerEntryGettable & UriGettable> T make(API api, Container.Entry entry);
}
