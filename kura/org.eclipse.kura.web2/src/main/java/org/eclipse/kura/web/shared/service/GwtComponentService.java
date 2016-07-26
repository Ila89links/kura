/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
package org.eclipse.kura.web.shared.service;

import java.util.List;

import org.eclipse.kura.web.shared.GwtKuraException;
import org.eclipse.kura.web.shared.model.GwtConfigComponent;
import org.eclipse.kura.web.shared.model.GwtXSRFToken;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("component")
public interface GwtComponentService extends RemoteService 
{	
	/**
	 * Returns the configuration of a Device as the list of all the configurable components.
	 * @param device
	 * @return
	 */
	public List<GwtConfigComponent> findComponentConfigurations(GwtXSRFToken xsrfToken) throws GwtKuraException;
	
	public List<GwtConfigComponent> findComponentConfiguration(GwtXSRFToken xsrfToken) throws GwtKuraException;

	
	public void updateComponentConfiguration(GwtXSRFToken xsrfToken, GwtConfigComponent configComponent) throws GwtKuraException; 
}
