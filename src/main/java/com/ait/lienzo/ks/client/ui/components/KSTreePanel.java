/*
   Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.lienzo.ks.client.ui.components;

import com.ait.lienzo.ks.shared.XSS;
import com.ait.toolkit.sencha.ext.client.ui.TreePanel;
import com.ait.toolkit.sencha.shared.client.data.Store;

public class KSTreePanel extends TreePanel
{
    public KSTreePanel()
    {
        setLines(false);

        setUseArrows(true);

        setRootVisible(false);
    }

    public KSTreePanel(Store store)
    {
        super(store);

        setLines(false);

        setUseArrows(true);

        setRootVisible(false);
    }

    public KSTreePanel(String title, Store store)
    {
        super(title, store);

        setLines(false);

        setUseArrows(true);

        setRootVisible(false);
    }

    @Override
    public void setTitle(String title)
    {
        super.setTitle(XSS.get().clean(title));
    }

    @Override
    public void setTitle(String title, String iconcls)
    {
        super.setTitle(XSS.get().clean(title), iconcls);
    }
}
