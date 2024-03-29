

/* First created by JCasGen Sat Oct 13 16:13:39 EDT 2012 */
package edu.cmu.lti.bio.alkesh.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.IntegerArray;
import org.apache.uima.jcas.tcas.Annotation;


/** List of gene tags with their source information
 * Updated by JCasGen Sat Oct 13 17:12:36 EDT 2012
 * XML source: /host/Users/alkesh/Desktop/Semester1/F12-Software_Engineering_for_Information_Systems/Assignments/hw1-alkeshku/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class GeneTagList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneTagList.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneTagList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneTagList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneTagList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneTagList(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets Sentence source Id
   * @generated */
  public String getId() {
    if (GeneTagList_Type.featOkTst && ((GeneTagList_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.bio.types.GeneTagList");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTagList_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets Sentence source Id 
   * @generated */
  public void setId(String v) {
    if (GeneTagList_Type.featOkTst && ((GeneTagList_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.bio.types.GeneTagList");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTagList_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: geneList

  /** getter for geneList - gets 
   * @generated */
  public FSList getGeneList() {
    if (GeneTagList_Type.featOkTst && ((GeneTagList_Type)jcasType).casFeat_geneList == null)
      jcasType.jcas.throwFeatMissing("geneList", "edu.cmu.lti.bio.types.GeneTagList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GeneTagList_Type)jcasType).casFeatCode_geneList)));}
    
  /** setter for geneList - sets  
   * @generated */
  public void setGeneList(FSList v) {
    if (GeneTagList_Type.featOkTst && ((GeneTagList_Type)jcasType).casFeat_geneList == null)
      jcasType.jcas.throwFeatMissing("geneList", "edu.cmu.lti.bio.types.GeneTagList");
    jcasType.ll_cas.ll_setRefValue(addr, ((GeneTagList_Type)jcasType).casFeatCode_geneList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated */
  public String getText() {
    if (GeneTagList_Type.featOkTst && ((GeneTagList_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.bio.types.GeneTagList");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTagList_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets  
   * @generated */
  public void setText(String v) {
    if (GeneTagList_Type.featOkTst && ((GeneTagList_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.bio.types.GeneTagList");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTagList_Type)jcasType).casFeatCode_text, v);}    
  }

    