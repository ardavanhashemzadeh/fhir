package org.hl7.fhir.utilities.cache;

public class ToolsVersion {

  /**
   * This constant is the maseter tool version. Any time this is updated, all the downstream tools know that something about the cache has changed, and require to be synchronised.
   * 
   * This constant is released in the following ways:
   *  - with the master source code
   *  - in the jar code for the publisher
   *  - in the packages (spec.internals, and package.json)
   *  - in the validator package (validator.tgz)
   *  
   * this constant is checked 
   *  - when loading the current version package
   */
  public final static int TOOLS_VERSION = 2;
  
  // version history:
  // 2: split auto-ig into r3/r4 content
  // arbitrarily started at 1 when changing to git
}
