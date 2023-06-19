package org.metable.trek.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.metable.trek.services.TrekGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTrekParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'{'", "'}'", "'rep'", "';'", "'string'", "'int'", "'boolean'", "'char'", "'double'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalTrekParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTrekParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTrekParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTrek.g"; }



     	private TrekGrammarAccess grammarAccess;

        public InternalTrekParser(TokenStream input, TrekGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TrekGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTrek.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTrek.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTrek.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTrek.g:71:1: ruleModel returns [EObject current=null] : ( (lv_type_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalTrek.g:77:2: ( ( (lv_type_0_0= ruleType ) )* )
            // InternalTrek.g:78:2: ( (lv_type_0_0= ruleType ) )*
            {
            // InternalTrek.g:78:2: ( (lv_type_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTrek.g:79:3: (lv_type_0_0= ruleType )
            	    {
            	    // InternalTrek.g:79:3: (lv_type_0_0= ruleType )
            	    // InternalTrek.g:80:4: lv_type_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTypeTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_type_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"type",
            	    					lv_type_0_0,
            	    					"org.metable.trek.Trek.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalTrek.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTrek.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalTrek.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTrek.g:107:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reps_3_0= ruleRep ) )* otherlv_4= '}' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reps_3_0 = null;



        	enterRule();

        try {
            // InternalTrek.g:113:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reps_3_0= ruleRep ) )* otherlv_4= '}' ) )
            // InternalTrek.g:114:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reps_3_0= ruleRep ) )* otherlv_4= '}' )
            {
            // InternalTrek.g:114:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reps_3_0= ruleRep ) )* otherlv_4= '}' )
            // InternalTrek.g:115:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reps_3_0= ruleRep ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalTrek.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrek.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrek.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalTrek.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTrek.g:141:3: ( (lv_reps_3_0= ruleRep ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTrek.g:142:4: (lv_reps_3_0= ruleRep )
            	    {
            	    // InternalTrek.g:142:4: (lv_reps_3_0= ruleRep )
            	    // InternalTrek.g:143:5: lv_reps_3_0= ruleRep
            	    {

            	    					newCompositeNode(grammarAccess.getTypeAccess().getRepsRepParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_reps_3_0=ruleRep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reps",
            	    						lv_reps_3_0,
            	    						"org.metable.trek.Trek.Rep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRep"
    // InternalTrek.g:168:1: entryRuleRep returns [EObject current=null] : iv_ruleRep= ruleRep EOF ;
    public final EObject entryRuleRep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRep = null;


        try {
            // InternalTrek.g:168:44: (iv_ruleRep= ruleRep EOF )
            // InternalTrek.g:169:2: iv_ruleRep= ruleRep EOF
            {
             newCompositeNode(grammarAccess.getRepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRep=ruleRep();

            state._fsp--;

             current =iv_ruleRep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRep"


    // $ANTLR start "ruleRep"
    // InternalTrek.g:175:1: ruleRep returns [EObject current=null] : (otherlv_0= 'rep' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleRepComponent ) )+ otherlv_4= '}' ) ;
    public final EObject ruleRep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;



        	enterRule();

        try {
            // InternalTrek.g:181:2: ( (otherlv_0= 'rep' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleRepComponent ) )+ otherlv_4= '}' ) )
            // InternalTrek.g:182:2: (otherlv_0= 'rep' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleRepComponent ) )+ otherlv_4= '}' )
            {
            // InternalTrek.g:182:2: (otherlv_0= 'rep' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleRepComponent ) )+ otherlv_4= '}' )
            // InternalTrek.g:183:3: otherlv_0= 'rep' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleRepComponent ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRepAccess().getRepKeyword_0());
            		
            // InternalTrek.g:187:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrek.g:188:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrek.g:188:4: (lv_name_1_0= RULE_ID )
            // InternalTrek.g:189:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRepAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRepAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTrek.g:209:3: ( (lv_components_3_0= ruleRepComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=16 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTrek.g:210:4: (lv_components_3_0= ruleRepComponent )
            	    {
            	    // InternalTrek.g:210:4: (lv_components_3_0= ruleRepComponent )
            	    // InternalTrek.g:211:5: lv_components_3_0= ruleRepComponent
            	    {

            	    					newCompositeNode(grammarAccess.getRepAccess().getComponentsRepComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_components_3_0=ruleRepComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"org.metable.trek.Trek.RepComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRepAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRep"


    // $ANTLR start "entryRuleRepComponent"
    // InternalTrek.g:236:1: entryRuleRepComponent returns [EObject current=null] : iv_ruleRepComponent= ruleRepComponent EOF ;
    public final EObject entryRuleRepComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepComponent = null;


        try {
            // InternalTrek.g:236:53: (iv_ruleRepComponent= ruleRepComponent EOF )
            // InternalTrek.g:237:2: iv_ruleRepComponent= ruleRepComponent EOF
            {
             newCompositeNode(grammarAccess.getRepComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepComponent=ruleRepComponent();

            state._fsp--;

             current =iv_ruleRepComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepComponent"


    // $ANTLR start "ruleRepComponent"
    // InternalTrek.g:243:1: ruleRepComponent returns [EObject current=null] : ( ( (lv_type_0_0= ruleRepComponentType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleRepComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalTrek.g:249:2: ( ( ( (lv_type_0_0= ruleRepComponentType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalTrek.g:250:2: ( ( (lv_type_0_0= ruleRepComponentType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalTrek.g:250:2: ( ( (lv_type_0_0= ruleRepComponentType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalTrek.g:251:3: ( (lv_type_0_0= ruleRepComponentType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalTrek.g:251:3: ( (lv_type_0_0= ruleRepComponentType ) )
            // InternalTrek.g:252:4: (lv_type_0_0= ruleRepComponentType )
            {
            // InternalTrek.g:252:4: (lv_type_0_0= ruleRepComponentType )
            // InternalTrek.g:253:5: lv_type_0_0= ruleRepComponentType
            {

            					newCompositeNode(grammarAccess.getRepComponentAccess().getTypeRepComponentTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleRepComponentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepComponentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.metable.trek.Trek.RepComponentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrek.g:270:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrek.g:271:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrek.g:271:4: (lv_name_1_0= RULE_ID )
            // InternalTrek.g:272:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRepComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRepComponentAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepComponent"


    // $ANTLR start "entryRuleRepComponentType"
    // InternalTrek.g:296:1: entryRuleRepComponentType returns [EObject current=null] : iv_ruleRepComponentType= ruleRepComponentType EOF ;
    public final EObject entryRuleRepComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepComponentType = null;


        try {
            // InternalTrek.g:296:57: (iv_ruleRepComponentType= ruleRepComponentType EOF )
            // InternalTrek.g:297:2: iv_ruleRepComponentType= ruleRepComponentType EOF
            {
             newCompositeNode(grammarAccess.getRepComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepComponentType=ruleRepComponentType();

            state._fsp--;

             current =iv_ruleRepComponentType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepComponentType"


    // $ANTLR start "ruleRepComponentType"
    // InternalTrek.g:303:1: ruleRepComponentType returns [EObject current=null] : (this_SystemType_0= ruleSystemType | this_TypeType_1= ruleTypeType ) ;
    public final EObject ruleRepComponentType() throws RecognitionException {
        EObject current = null;

        EObject this_SystemType_0 = null;

        EObject this_TypeType_1 = null;



        	enterRule();

        try {
            // InternalTrek.g:309:2: ( (this_SystemType_0= ruleSystemType | this_TypeType_1= ruleTypeType ) )
            // InternalTrek.g:310:2: (this_SystemType_0= ruleSystemType | this_TypeType_1= ruleTypeType )
            {
            // InternalTrek.g:310:2: (this_SystemType_0= ruleSystemType | this_TypeType_1= ruleTypeType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=20)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTrek.g:311:3: this_SystemType_0= ruleSystemType
                    {

                    			newCompositeNode(grammarAccess.getRepComponentTypeAccess().getSystemTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemType_0=ruleSystemType();

                    state._fsp--;


                    			current = this_SystemType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTrek.g:320:3: this_TypeType_1= ruleTypeType
                    {

                    			newCompositeNode(grammarAccess.getRepComponentTypeAccess().getTypeTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeType_1=ruleTypeType();

                    state._fsp--;


                    			current = this_TypeType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepComponentType"


    // $ANTLR start "entryRuleSystemType"
    // InternalTrek.g:332:1: entryRuleSystemType returns [EObject current=null] : iv_ruleSystemType= ruleSystemType EOF ;
    public final EObject entryRuleSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemType = null;


        try {
            // InternalTrek.g:332:51: (iv_ruleSystemType= ruleSystemType EOF )
            // InternalTrek.g:333:2: iv_ruleSystemType= ruleSystemType EOF
            {
             newCompositeNode(grammarAccess.getSystemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemType=ruleSystemType();

            state._fsp--;

             current =iv_ruleSystemType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemType"


    // $ANTLR start "ruleSystemType"
    // InternalTrek.g:339:1: ruleSystemType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' ) ) ) ;
    public final EObject ruleSystemType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;


        	enterRule();

        try {
            // InternalTrek.g:345:2: ( ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' ) ) ) )
            // InternalTrek.g:346:2: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' ) ) )
            {
            // InternalTrek.g:346:2: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' ) ) )
            // InternalTrek.g:347:3: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' ) )
            {
            // InternalTrek.g:347:3: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' ) )
            // InternalTrek.g:348:4: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' )
            {
            // InternalTrek.g:348:4: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' | lv_typeName_0_4= 'char' | lv_typeName_0_5= 'double' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTrek.g:349:5: lv_typeName_0_1= 'string'
                    {
                    lv_typeName_0_1=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getSystemTypeAccess().getTypeNameStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTrek.g:360:5: lv_typeName_0_2= 'int'
                    {
                    lv_typeName_0_2=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getSystemTypeAccess().getTypeNameIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalTrek.g:371:5: lv_typeName_0_3= 'boolean'
                    {
                    lv_typeName_0_3=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_3, grammarAccess.getSystemTypeAccess().getTypeNameBooleanKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalTrek.g:382:5: lv_typeName_0_4= 'char'
                    {
                    lv_typeName_0_4=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_4, grammarAccess.getSystemTypeAccess().getTypeNameCharKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalTrek.g:393:5: lv_typeName_0_5= 'double'
                    {
                    lv_typeName_0_5=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_5, grammarAccess.getSystemTypeAccess().getTypeNameDoubleKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSystemTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemType"


    // $ANTLR start "entryRuleTypeType"
    // InternalTrek.g:409:1: entryRuleTypeType returns [EObject current=null] : iv_ruleTypeType= ruleTypeType EOF ;
    public final EObject entryRuleTypeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeType = null;


        try {
            // InternalTrek.g:409:49: (iv_ruleTypeType= ruleTypeType EOF )
            // InternalTrek.g:410:2: iv_ruleTypeType= ruleTypeType EOF
            {
             newCompositeNode(grammarAccess.getTypeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeType=ruleTypeType();

            state._fsp--;

             current =iv_ruleTypeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeType"


    // $ANTLR start "ruleTypeType"
    // InternalTrek.g:416:1: ruleTypeType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTrek.g:422:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTrek.g:423:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTrek.g:423:2: ( (otherlv_0= RULE_ID ) )
            // InternalTrek.g:424:3: (otherlv_0= RULE_ID )
            {
            // InternalTrek.g:424:3: (otherlv_0= RULE_ID )
            // InternalTrek.g:425:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTypeTypeAccess().getTypeTypeCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F2010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});

}