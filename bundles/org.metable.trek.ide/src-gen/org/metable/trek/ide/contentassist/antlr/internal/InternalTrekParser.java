package org.metable.trek.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.metable.trek.services.TrekGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTrekParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'char'", "'double'", "'type'", "'{'", "'}'", "'rep'", "';'"
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

    	public void setGrammarAccess(TrekGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalTrek.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTrek.g:54:1: ( ruleModel EOF )
            // InternalTrek.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTrek.g:62:1: ruleModel : ( ( rule__Model__TypeAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:66:2: ( ( ( rule__Model__TypeAssignment )* ) )
            // InternalTrek.g:67:2: ( ( rule__Model__TypeAssignment )* )
            {
            // InternalTrek.g:67:2: ( ( rule__Model__TypeAssignment )* )
            // InternalTrek.g:68:3: ( rule__Model__TypeAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypeAssignment()); 
            // InternalTrek.g:69:3: ( rule__Model__TypeAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTrek.g:69:4: rule__Model__TypeAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__TypeAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalTrek.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalTrek.g:79:1: ( ruleType EOF )
            // InternalTrek.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTrek.g:87:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:91:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalTrek.g:92:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalTrek.g:92:2: ( ( rule__Type__Group__0 ) )
            // InternalTrek.g:93:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalTrek.g:94:3: ( rule__Type__Group__0 )
            // InternalTrek.g:94:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRep"
    // InternalTrek.g:103:1: entryRuleRep : ruleRep EOF ;
    public final void entryRuleRep() throws RecognitionException {
        try {
            // InternalTrek.g:104:1: ( ruleRep EOF )
            // InternalTrek.g:105:1: ruleRep EOF
            {
             before(grammarAccess.getRepRule()); 
            pushFollow(FOLLOW_1);
            ruleRep();

            state._fsp--;

             after(grammarAccess.getRepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRep"


    // $ANTLR start "ruleRep"
    // InternalTrek.g:112:1: ruleRep : ( ( rule__Rep__Group__0 ) ) ;
    public final void ruleRep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:116:2: ( ( ( rule__Rep__Group__0 ) ) )
            // InternalTrek.g:117:2: ( ( rule__Rep__Group__0 ) )
            {
            // InternalTrek.g:117:2: ( ( rule__Rep__Group__0 ) )
            // InternalTrek.g:118:3: ( rule__Rep__Group__0 )
            {
             before(grammarAccess.getRepAccess().getGroup()); 
            // InternalTrek.g:119:3: ( rule__Rep__Group__0 )
            // InternalTrek.g:119:4: rule__Rep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRep"


    // $ANTLR start "entryRuleRepComponent"
    // InternalTrek.g:128:1: entryRuleRepComponent : ruleRepComponent EOF ;
    public final void entryRuleRepComponent() throws RecognitionException {
        try {
            // InternalTrek.g:129:1: ( ruleRepComponent EOF )
            // InternalTrek.g:130:1: ruleRepComponent EOF
            {
             before(grammarAccess.getRepComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleRepComponent();

            state._fsp--;

             after(grammarAccess.getRepComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepComponent"


    // $ANTLR start "ruleRepComponent"
    // InternalTrek.g:137:1: ruleRepComponent : ( ( rule__RepComponent__Group__0 ) ) ;
    public final void ruleRepComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:141:2: ( ( ( rule__RepComponent__Group__0 ) ) )
            // InternalTrek.g:142:2: ( ( rule__RepComponent__Group__0 ) )
            {
            // InternalTrek.g:142:2: ( ( rule__RepComponent__Group__0 ) )
            // InternalTrek.g:143:3: ( rule__RepComponent__Group__0 )
            {
             before(grammarAccess.getRepComponentAccess().getGroup()); 
            // InternalTrek.g:144:3: ( rule__RepComponent__Group__0 )
            // InternalTrek.g:144:4: rule__RepComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepComponent"


    // $ANTLR start "entryRuleRepComponentType"
    // InternalTrek.g:153:1: entryRuleRepComponentType : ruleRepComponentType EOF ;
    public final void entryRuleRepComponentType() throws RecognitionException {
        try {
            // InternalTrek.g:154:1: ( ruleRepComponentType EOF )
            // InternalTrek.g:155:1: ruleRepComponentType EOF
            {
             before(grammarAccess.getRepComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRepComponentType();

            state._fsp--;

             after(grammarAccess.getRepComponentTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepComponentType"


    // $ANTLR start "ruleRepComponentType"
    // InternalTrek.g:162:1: ruleRepComponentType : ( ( rule__RepComponentType__Alternatives ) ) ;
    public final void ruleRepComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:166:2: ( ( ( rule__RepComponentType__Alternatives ) ) )
            // InternalTrek.g:167:2: ( ( rule__RepComponentType__Alternatives ) )
            {
            // InternalTrek.g:167:2: ( ( rule__RepComponentType__Alternatives ) )
            // InternalTrek.g:168:3: ( rule__RepComponentType__Alternatives )
            {
             before(grammarAccess.getRepComponentTypeAccess().getAlternatives()); 
            // InternalTrek.g:169:3: ( rule__RepComponentType__Alternatives )
            // InternalTrek.g:169:4: rule__RepComponentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RepComponentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRepComponentTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepComponentType"


    // $ANTLR start "entryRuleSystemType"
    // InternalTrek.g:178:1: entryRuleSystemType : ruleSystemType EOF ;
    public final void entryRuleSystemType() throws RecognitionException {
        try {
            // InternalTrek.g:179:1: ( ruleSystemType EOF )
            // InternalTrek.g:180:1: ruleSystemType EOF
            {
             before(grammarAccess.getSystemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemType();

            state._fsp--;

             after(grammarAccess.getSystemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemType"


    // $ANTLR start "ruleSystemType"
    // InternalTrek.g:187:1: ruleSystemType : ( ( rule__SystemType__TypeNameAssignment ) ) ;
    public final void ruleSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:191:2: ( ( ( rule__SystemType__TypeNameAssignment ) ) )
            // InternalTrek.g:192:2: ( ( rule__SystemType__TypeNameAssignment ) )
            {
            // InternalTrek.g:192:2: ( ( rule__SystemType__TypeNameAssignment ) )
            // InternalTrek.g:193:3: ( rule__SystemType__TypeNameAssignment )
            {
             before(grammarAccess.getSystemTypeAccess().getTypeNameAssignment()); 
            // InternalTrek.g:194:3: ( rule__SystemType__TypeNameAssignment )
            // InternalTrek.g:194:4: rule__SystemType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SystemType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSystemTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemType"


    // $ANTLR start "entryRuleTypeType"
    // InternalTrek.g:203:1: entryRuleTypeType : ruleTypeType EOF ;
    public final void entryRuleTypeType() throws RecognitionException {
        try {
            // InternalTrek.g:204:1: ( ruleTypeType EOF )
            // InternalTrek.g:205:1: ruleTypeType EOF
            {
             before(grammarAccess.getTypeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeType();

            state._fsp--;

             after(grammarAccess.getTypeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeType"


    // $ANTLR start "ruleTypeType"
    // InternalTrek.g:212:1: ruleTypeType : ( ( rule__TypeType__TypeAssignment ) ) ;
    public final void ruleTypeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:216:2: ( ( ( rule__TypeType__TypeAssignment ) ) )
            // InternalTrek.g:217:2: ( ( rule__TypeType__TypeAssignment ) )
            {
            // InternalTrek.g:217:2: ( ( rule__TypeType__TypeAssignment ) )
            // InternalTrek.g:218:3: ( rule__TypeType__TypeAssignment )
            {
             before(grammarAccess.getTypeTypeAccess().getTypeAssignment()); 
            // InternalTrek.g:219:3: ( rule__TypeType__TypeAssignment )
            // InternalTrek.g:219:4: rule__TypeType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeType"


    // $ANTLR start "rule__RepComponentType__Alternatives"
    // InternalTrek.g:227:1: rule__RepComponentType__Alternatives : ( ( ruleSystemType ) | ( ruleTypeType ) );
    public final void rule__RepComponentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:231:1: ( ( ruleSystemType ) | ( ruleTypeType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTrek.g:232:2: ( ruleSystemType )
                    {
                    // InternalTrek.g:232:2: ( ruleSystemType )
                    // InternalTrek.g:233:3: ruleSystemType
                    {
                     before(grammarAccess.getRepComponentTypeAccess().getSystemTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemType();

                    state._fsp--;

                     after(grammarAccess.getRepComponentTypeAccess().getSystemTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrek.g:238:2: ( ruleTypeType )
                    {
                    // InternalTrek.g:238:2: ( ruleTypeType )
                    // InternalTrek.g:239:3: ruleTypeType
                    {
                     before(grammarAccess.getRepComponentTypeAccess().getTypeTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeType();

                    state._fsp--;

                     after(grammarAccess.getRepComponentTypeAccess().getTypeTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponentType__Alternatives"


    // $ANTLR start "rule__SystemType__TypeNameAlternatives_0"
    // InternalTrek.g:248:1: rule__SystemType__TypeNameAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) | ( 'char' ) | ( 'double' ) );
    public final void rule__SystemType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:252:1: ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) | ( 'char' ) | ( 'double' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTrek.g:253:2: ( 'string' )
                    {
                    // InternalTrek.g:253:2: ( 'string' )
                    // InternalTrek.g:254:3: 'string'
                    {
                     before(grammarAccess.getSystemTypeAccess().getTypeNameStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSystemTypeAccess().getTypeNameStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrek.g:259:2: ( 'int' )
                    {
                    // InternalTrek.g:259:2: ( 'int' )
                    // InternalTrek.g:260:3: 'int'
                    {
                     before(grammarAccess.getSystemTypeAccess().getTypeNameIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSystemTypeAccess().getTypeNameIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrek.g:265:2: ( 'boolean' )
                    {
                    // InternalTrek.g:265:2: ( 'boolean' )
                    // InternalTrek.g:266:3: 'boolean'
                    {
                     before(grammarAccess.getSystemTypeAccess().getTypeNameBooleanKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSystemTypeAccess().getTypeNameBooleanKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTrek.g:271:2: ( 'char' )
                    {
                    // InternalTrek.g:271:2: ( 'char' )
                    // InternalTrek.g:272:3: 'char'
                    {
                     before(grammarAccess.getSystemTypeAccess().getTypeNameCharKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSystemTypeAccess().getTypeNameCharKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTrek.g:277:2: ( 'double' )
                    {
                    // InternalTrek.g:277:2: ( 'double' )
                    // InternalTrek.g:278:3: 'double'
                    {
                     before(grammarAccess.getSystemTypeAccess().getTypeNameDoubleKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSystemTypeAccess().getTypeNameDoubleKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Type__Group__0"
    // InternalTrek.g:287:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:291:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalTrek.g:292:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalTrek.g:299:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:303:1: ( ( 'type' ) )
            // InternalTrek.g:304:1: ( 'type' )
            {
            // InternalTrek.g:304:1: ( 'type' )
            // InternalTrek.g:305:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalTrek.g:314:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:318:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalTrek.g:319:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalTrek.g:326:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:330:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalTrek.g:331:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalTrek.g:331:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalTrek.g:332:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalTrek.g:333:2: ( rule__Type__NameAssignment_1 )
            // InternalTrek.g:333:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalTrek.g:341:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:345:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalTrek.g:346:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalTrek.g:353:1: rule__Type__Group__2__Impl : ( '{' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:357:1: ( ( '{' ) )
            // InternalTrek.g:358:1: ( '{' )
            {
            // InternalTrek.g:358:1: ( '{' )
            // InternalTrek.g:359:2: '{'
            {
             before(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalTrek.g:368:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:372:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalTrek.g:373:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalTrek.g:380:1: rule__Type__Group__3__Impl : ( ( rule__Type__RepsAssignment_3 )* ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:384:1: ( ( ( rule__Type__RepsAssignment_3 )* ) )
            // InternalTrek.g:385:1: ( ( rule__Type__RepsAssignment_3 )* )
            {
            // InternalTrek.g:385:1: ( ( rule__Type__RepsAssignment_3 )* )
            // InternalTrek.g:386:2: ( rule__Type__RepsAssignment_3 )*
            {
             before(grammarAccess.getTypeAccess().getRepsAssignment_3()); 
            // InternalTrek.g:387:2: ( rule__Type__RepsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTrek.g:387:3: rule__Type__RepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Type__RepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getRepsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__4"
    // InternalTrek.g:395:1: rule__Type__Group__4 : rule__Type__Group__4__Impl ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:399:1: ( rule__Type__Group__4__Impl )
            // InternalTrek.g:400:2: rule__Type__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalTrek.g:406:1: rule__Type__Group__4__Impl : ( '}' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:410:1: ( ( '}' ) )
            // InternalTrek.g:411:1: ( '}' )
            {
            // InternalTrek.g:411:1: ( '}' )
            // InternalTrek.g:412:2: '}'
            {
             before(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Rep__Group__0"
    // InternalTrek.g:422:1: rule__Rep__Group__0 : rule__Rep__Group__0__Impl rule__Rep__Group__1 ;
    public final void rule__Rep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:426:1: ( rule__Rep__Group__0__Impl rule__Rep__Group__1 )
            // InternalTrek.g:427:2: rule__Rep__Group__0__Impl rule__Rep__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__0"


    // $ANTLR start "rule__Rep__Group__0__Impl"
    // InternalTrek.g:434:1: rule__Rep__Group__0__Impl : ( 'rep' ) ;
    public final void rule__Rep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:438:1: ( ( 'rep' ) )
            // InternalTrek.g:439:1: ( 'rep' )
            {
            // InternalTrek.g:439:1: ( 'rep' )
            // InternalTrek.g:440:2: 'rep'
            {
             before(grammarAccess.getRepAccess().getRepKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRepAccess().getRepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__0__Impl"


    // $ANTLR start "rule__Rep__Group__1"
    // InternalTrek.g:449:1: rule__Rep__Group__1 : rule__Rep__Group__1__Impl rule__Rep__Group__2 ;
    public final void rule__Rep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:453:1: ( rule__Rep__Group__1__Impl rule__Rep__Group__2 )
            // InternalTrek.g:454:2: rule__Rep__Group__1__Impl rule__Rep__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__1"


    // $ANTLR start "rule__Rep__Group__1__Impl"
    // InternalTrek.g:461:1: rule__Rep__Group__1__Impl : ( ( rule__Rep__NameAssignment_1 ) ) ;
    public final void rule__Rep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:465:1: ( ( ( rule__Rep__NameAssignment_1 ) ) )
            // InternalTrek.g:466:1: ( ( rule__Rep__NameAssignment_1 ) )
            {
            // InternalTrek.g:466:1: ( ( rule__Rep__NameAssignment_1 ) )
            // InternalTrek.g:467:2: ( rule__Rep__NameAssignment_1 )
            {
             before(grammarAccess.getRepAccess().getNameAssignment_1()); 
            // InternalTrek.g:468:2: ( rule__Rep__NameAssignment_1 )
            // InternalTrek.g:468:3: rule__Rep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__1__Impl"


    // $ANTLR start "rule__Rep__Group__2"
    // InternalTrek.g:476:1: rule__Rep__Group__2 : rule__Rep__Group__2__Impl rule__Rep__Group__3 ;
    public final void rule__Rep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:480:1: ( rule__Rep__Group__2__Impl rule__Rep__Group__3 )
            // InternalTrek.g:481:2: rule__Rep__Group__2__Impl rule__Rep__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Rep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__2"


    // $ANTLR start "rule__Rep__Group__2__Impl"
    // InternalTrek.g:488:1: rule__Rep__Group__2__Impl : ( '{' ) ;
    public final void rule__Rep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:492:1: ( ( '{' ) )
            // InternalTrek.g:493:1: ( '{' )
            {
            // InternalTrek.g:493:1: ( '{' )
            // InternalTrek.g:494:2: '{'
            {
             before(grammarAccess.getRepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__2__Impl"


    // $ANTLR start "rule__Rep__Group__3"
    // InternalTrek.g:503:1: rule__Rep__Group__3 : rule__Rep__Group__3__Impl rule__Rep__Group__4 ;
    public final void rule__Rep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:507:1: ( rule__Rep__Group__3__Impl rule__Rep__Group__4 )
            // InternalTrek.g:508:2: rule__Rep__Group__3__Impl rule__Rep__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Rep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__3"


    // $ANTLR start "rule__Rep__Group__3__Impl"
    // InternalTrek.g:515:1: rule__Rep__Group__3__Impl : ( ( ( rule__Rep__ComponentsAssignment_3 ) ) ( ( rule__Rep__ComponentsAssignment_3 )* ) ) ;
    public final void rule__Rep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:519:1: ( ( ( ( rule__Rep__ComponentsAssignment_3 ) ) ( ( rule__Rep__ComponentsAssignment_3 )* ) ) )
            // InternalTrek.g:520:1: ( ( ( rule__Rep__ComponentsAssignment_3 ) ) ( ( rule__Rep__ComponentsAssignment_3 )* ) )
            {
            // InternalTrek.g:520:1: ( ( ( rule__Rep__ComponentsAssignment_3 ) ) ( ( rule__Rep__ComponentsAssignment_3 )* ) )
            // InternalTrek.g:521:2: ( ( rule__Rep__ComponentsAssignment_3 ) ) ( ( rule__Rep__ComponentsAssignment_3 )* )
            {
            // InternalTrek.g:521:2: ( ( rule__Rep__ComponentsAssignment_3 ) )
            // InternalTrek.g:522:3: ( rule__Rep__ComponentsAssignment_3 )
            {
             before(grammarAccess.getRepAccess().getComponentsAssignment_3()); 
            // InternalTrek.g:523:3: ( rule__Rep__ComponentsAssignment_3 )
            // InternalTrek.g:523:4: rule__Rep__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Rep__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepAccess().getComponentsAssignment_3()); 

            }

            // InternalTrek.g:526:2: ( ( rule__Rep__ComponentsAssignment_3 )* )
            // InternalTrek.g:527:3: ( rule__Rep__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getRepAccess().getComponentsAssignment_3()); 
            // InternalTrek.g:528:3: ( rule__Rep__ComponentsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=15)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTrek.g:528:4: rule__Rep__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Rep__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRepAccess().getComponentsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__3__Impl"


    // $ANTLR start "rule__Rep__Group__4"
    // InternalTrek.g:537:1: rule__Rep__Group__4 : rule__Rep__Group__4__Impl ;
    public final void rule__Rep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:541:1: ( rule__Rep__Group__4__Impl )
            // InternalTrek.g:542:2: rule__Rep__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rep__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__4"


    // $ANTLR start "rule__Rep__Group__4__Impl"
    // InternalTrek.g:548:1: rule__Rep__Group__4__Impl : ( '}' ) ;
    public final void rule__Rep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:552:1: ( ( '}' ) )
            // InternalTrek.g:553:1: ( '}' )
            {
            // InternalTrek.g:553:1: ( '}' )
            // InternalTrek.g:554:2: '}'
            {
             before(grammarAccess.getRepAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRepAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__Group__4__Impl"


    // $ANTLR start "rule__RepComponent__Group__0"
    // InternalTrek.g:564:1: rule__RepComponent__Group__0 : rule__RepComponent__Group__0__Impl rule__RepComponent__Group__1 ;
    public final void rule__RepComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:568:1: ( rule__RepComponent__Group__0__Impl rule__RepComponent__Group__1 )
            // InternalTrek.g:569:2: rule__RepComponent__Group__0__Impl rule__RepComponent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RepComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__Group__0"


    // $ANTLR start "rule__RepComponent__Group__0__Impl"
    // InternalTrek.g:576:1: rule__RepComponent__Group__0__Impl : ( ( rule__RepComponent__TypeAssignment_0 ) ) ;
    public final void rule__RepComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:580:1: ( ( ( rule__RepComponent__TypeAssignment_0 ) ) )
            // InternalTrek.g:581:1: ( ( rule__RepComponent__TypeAssignment_0 ) )
            {
            // InternalTrek.g:581:1: ( ( rule__RepComponent__TypeAssignment_0 ) )
            // InternalTrek.g:582:2: ( rule__RepComponent__TypeAssignment_0 )
            {
             before(grammarAccess.getRepComponentAccess().getTypeAssignment_0()); 
            // InternalTrek.g:583:2: ( rule__RepComponent__TypeAssignment_0 )
            // InternalTrek.g:583:3: rule__RepComponent__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RepComponent__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRepComponentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__Group__0__Impl"


    // $ANTLR start "rule__RepComponent__Group__1"
    // InternalTrek.g:591:1: rule__RepComponent__Group__1 : rule__RepComponent__Group__1__Impl rule__RepComponent__Group__2 ;
    public final void rule__RepComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:595:1: ( rule__RepComponent__Group__1__Impl rule__RepComponent__Group__2 )
            // InternalTrek.g:596:2: rule__RepComponent__Group__1__Impl rule__RepComponent__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RepComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__Group__1"


    // $ANTLR start "rule__RepComponent__Group__1__Impl"
    // InternalTrek.g:603:1: rule__RepComponent__Group__1__Impl : ( ( rule__RepComponent__NameAssignment_1 ) ) ;
    public final void rule__RepComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:607:1: ( ( ( rule__RepComponent__NameAssignment_1 ) ) )
            // InternalTrek.g:608:1: ( ( rule__RepComponent__NameAssignment_1 ) )
            {
            // InternalTrek.g:608:1: ( ( rule__RepComponent__NameAssignment_1 ) )
            // InternalTrek.g:609:2: ( rule__RepComponent__NameAssignment_1 )
            {
             before(grammarAccess.getRepComponentAccess().getNameAssignment_1()); 
            // InternalTrek.g:610:2: ( rule__RepComponent__NameAssignment_1 )
            // InternalTrek.g:610:3: rule__RepComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RepComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__Group__1__Impl"


    // $ANTLR start "rule__RepComponent__Group__2"
    // InternalTrek.g:618:1: rule__RepComponent__Group__2 : rule__RepComponent__Group__2__Impl ;
    public final void rule__RepComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:622:1: ( rule__RepComponent__Group__2__Impl )
            // InternalTrek.g:623:2: rule__RepComponent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepComponent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__Group__2"


    // $ANTLR start "rule__RepComponent__Group__2__Impl"
    // InternalTrek.g:629:1: rule__RepComponent__Group__2__Impl : ( ';' ) ;
    public final void rule__RepComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:633:1: ( ( ';' ) )
            // InternalTrek.g:634:1: ( ';' )
            {
            // InternalTrek.g:634:1: ( ';' )
            // InternalTrek.g:635:2: ';'
            {
             before(grammarAccess.getRepComponentAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRepComponentAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__Group__2__Impl"


    // $ANTLR start "rule__Model__TypeAssignment"
    // InternalTrek.g:645:1: rule__Model__TypeAssignment : ( ruleType ) ;
    public final void rule__Model__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:649:1: ( ( ruleType ) )
            // InternalTrek.g:650:2: ( ruleType )
            {
            // InternalTrek.g:650:2: ( ruleType )
            // InternalTrek.g:651:3: ruleType
            {
             before(grammarAccess.getModelAccess().getTypeTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypeTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypeAssignment"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalTrek.g:660:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:664:1: ( ( RULE_ID ) )
            // InternalTrek.g:665:2: ( RULE_ID )
            {
            // InternalTrek.g:665:2: ( RULE_ID )
            // InternalTrek.g:666:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__RepsAssignment_3"
    // InternalTrek.g:675:1: rule__Type__RepsAssignment_3 : ( ruleRep ) ;
    public final void rule__Type__RepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:679:1: ( ( ruleRep ) )
            // InternalTrek.g:680:2: ( ruleRep )
            {
            // InternalTrek.g:680:2: ( ruleRep )
            // InternalTrek.g:681:3: ruleRep
            {
             before(grammarAccess.getTypeAccess().getRepsRepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRep();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getRepsRepParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__RepsAssignment_3"


    // $ANTLR start "rule__Rep__NameAssignment_1"
    // InternalTrek.g:690:1: rule__Rep__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:694:1: ( ( RULE_ID ) )
            // InternalTrek.g:695:2: ( RULE_ID )
            {
            // InternalTrek.g:695:2: ( RULE_ID )
            // InternalTrek.g:696:3: RULE_ID
            {
             before(grammarAccess.getRepAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRepAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__NameAssignment_1"


    // $ANTLR start "rule__Rep__ComponentsAssignment_3"
    // InternalTrek.g:705:1: rule__Rep__ComponentsAssignment_3 : ( ruleRepComponent ) ;
    public final void rule__Rep__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:709:1: ( ( ruleRepComponent ) )
            // InternalTrek.g:710:2: ( ruleRepComponent )
            {
            // InternalTrek.g:710:2: ( ruleRepComponent )
            // InternalTrek.g:711:3: ruleRepComponent
            {
             before(grammarAccess.getRepAccess().getComponentsRepComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRepComponent();

            state._fsp--;

             after(grammarAccess.getRepAccess().getComponentsRepComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rep__ComponentsAssignment_3"


    // $ANTLR start "rule__RepComponent__TypeAssignment_0"
    // InternalTrek.g:720:1: rule__RepComponent__TypeAssignment_0 : ( ruleRepComponentType ) ;
    public final void rule__RepComponent__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:724:1: ( ( ruleRepComponentType ) )
            // InternalTrek.g:725:2: ( ruleRepComponentType )
            {
            // InternalTrek.g:725:2: ( ruleRepComponentType )
            // InternalTrek.g:726:3: ruleRepComponentType
            {
             before(grammarAccess.getRepComponentAccess().getTypeRepComponentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRepComponentType();

            state._fsp--;

             after(grammarAccess.getRepComponentAccess().getTypeRepComponentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__TypeAssignment_0"


    // $ANTLR start "rule__RepComponent__NameAssignment_1"
    // InternalTrek.g:735:1: rule__RepComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RepComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:739:1: ( ( RULE_ID ) )
            // InternalTrek.g:740:2: ( RULE_ID )
            {
            // InternalTrek.g:740:2: ( RULE_ID )
            // InternalTrek.g:741:3: RULE_ID
            {
             before(grammarAccess.getRepComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRepComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepComponent__NameAssignment_1"


    // $ANTLR start "rule__SystemType__TypeNameAssignment"
    // InternalTrek.g:750:1: rule__SystemType__TypeNameAssignment : ( ( rule__SystemType__TypeNameAlternatives_0 ) ) ;
    public final void rule__SystemType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:754:1: ( ( ( rule__SystemType__TypeNameAlternatives_0 ) ) )
            // InternalTrek.g:755:2: ( ( rule__SystemType__TypeNameAlternatives_0 ) )
            {
            // InternalTrek.g:755:2: ( ( rule__SystemType__TypeNameAlternatives_0 ) )
            // InternalTrek.g:756:3: ( rule__SystemType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getSystemTypeAccess().getTypeNameAlternatives_0()); 
            // InternalTrek.g:757:3: ( rule__SystemType__TypeNameAlternatives_0 )
            // InternalTrek.g:757:4: rule__SystemType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SystemType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemType__TypeNameAssignment"


    // $ANTLR start "rule__TypeType__TypeAssignment"
    // InternalTrek.g:765:1: rule__TypeType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrek.g:769:1: ( ( ( RULE_ID ) ) )
            // InternalTrek.g:770:2: ( ( RULE_ID ) )
            {
            // InternalTrek.g:770:2: ( ( RULE_ID ) )
            // InternalTrek.g:771:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeTypeAccess().getTypeTypeCrossReference_0()); 
            // InternalTrek.g:772:3: ( RULE_ID )
            // InternalTrek.g:773:4: RULE_ID
            {
             before(grammarAccess.getTypeTypeAccess().getTypeTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeTypeAccess().getTypeTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTypeTypeAccess().getTypeTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeType__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000F810L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F812L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}