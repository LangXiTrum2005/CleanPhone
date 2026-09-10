package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class m9 implements monofuel {
    public static final m9 a = new m9();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        n9 n9Var;
        switch (i) {
            case 0:
                n9Var = n9.DEBUGGER_STATE_UNSPECIFIED;
                break;
            case 1:
                n9Var = n9.DEBUGGER_STATE_NOT_INSTALLED;
                break;
            case 2:
                n9Var = n9.DEBUGGER_STATE_INSTALLED;
                break;
            case 3:
                n9Var = n9.DEBUGGER_STATE_ACTIVE;
                break;
            case 4:
                n9Var = n9.DEBUGGER_STATE_ENVVAR;
                break;
            case 5:
                n9Var = n9.DEBUGGER_STATE_MACHPORT;
                break;
            case 6:
                n9Var = n9.DEBUGGER_STATE_ENVVAR_MACHPORT;
                break;
            default:
                n9Var = null;
                break;
        }
        return n9Var != null;
    }
}
