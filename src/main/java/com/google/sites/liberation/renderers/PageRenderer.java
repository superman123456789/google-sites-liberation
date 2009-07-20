/*
 * Copyright (C) 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.sites.liberation.renderers;

import com.google.gdata.data.sites.BaseContentEntry;
import com.google.sites.liberation.elements.XmlElement;

/**
 * Defines an object that can render the different components
 * of a page from a Site as appropriate xhtml.
 * 
 * @author bsimon@google.com (Benjamin Simon)
 */
public interface PageRenderer {

  /** Renders link(s) to the parent(s) of a page. */
  XmlElement renderParentLinks();
  
  /** Renders the title of a page. */
  XmlElement renderTitle();
  
  /** Renders the main html content of a page. */
  XmlElement renderContent();
  
  /** Renders content that is specific to certain page types if it exists. */
  XmlElement renderAdditionalContent();
  
  /** Renders the links to the subpages of a page. */
  XmlElement renderSubpageLinks();
  
  /** Renders the attachment links of a page. */
  XmlElement renderAttachments();
  
  /** Renders the comments of a page. */
  XmlElement renderComments(); 
  
  /** Returns the entry this renderer represents. */
  BaseContentEntry<?> getEntry();
}