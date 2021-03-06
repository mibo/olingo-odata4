/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */package org.apache.olingo.commons.api.edm.provider.annotation;

import java.util.ArrayList;
import java.util.List;

import org.apache.olingo.commons.api.edm.provider.CsdlAnnotatable;
import org.apache.olingo.commons.api.edm.provider.CsdlAnnotation;

/**
 * The edm:LabeledElement expression assigns a name to a child expression. The value of the child expression can
 * then be reused elsewhere with an edm:LabeledElementReference (See {@link CsdlLabeledElementReference}) expression.
 */
public class CsdlLabeledElement extends CsdlDynamicExpression implements CsdlAnnotatable{

  private static final long serialVersionUID = -5885321101447070204L;

  private String name;
  private CsdlExpression value;
  private List<CsdlAnnotation> annotations = new ArrayList<CsdlAnnotation>();

  @Override
  public List<CsdlAnnotation> getAnnotations() {
    return annotations;
  }
  
  public CsdlLabeledElement setAnnotations(List<CsdlAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }
  
  /**
   * Returns the assigned name
   * @return assigned name
   */
  public String getName() {
    return name;
  }

  public CsdlLabeledElement setName(final String name) {
    this.name = name;
    return this;
  }

  /**
   * Returns the child expression
   *
   * @return child expression
   */
  public CsdlExpression getValue() {
    return value;
  }

  public CsdlLabeledElement setValue(final CsdlExpression value) {
    this.value = value;
    return this;
  }
}
