package com.thinkup.core.common.o0m.m;

import android.text.TextUtils;
import com.thinkup.core.common.o0m.o.mm;
import com.thinkup.core.common.o0m.o.on;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class n implements com.thinkup.core.common.o0m.o {
    private static final String o = "n";
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42143n;
    private final com.thinkup.core.common.o0m.o.o o0;
    private final int oo;

    public n(com.thinkup.core.common.o0m.n nVar) {
        mm.o oVar = new mm.o(nVar.o(), nVar.m());
        oVar.o();
        mm mmVarM = oVar.m();
        this.o0 = mmVarM;
        this.oo = nVar.o0();
        String strM = nVar.m();
        this.m = strM;
        if (strM.endsWith("tkv")) {
            this.f42143n = true;
        } else {
            this.f42143n = mmVarM.getBoolean("is_migrated", false);
        }
    }

    private static com.thinkup.core.common.o0m.o.o o(com.thinkup.core.common.o0m.n nVar) {
        mm.o oVar = new mm.o(nVar.o(), nVar.m());
        oVar.o();
        return oVar.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.thinkup.core.common.o0m.o
    public final <V> V m(String str, V v) {
        com.thinkup.core.common.o0m.o.o oVar;
        if (!TextUtils.isEmpty(str) && v != 0 && (oVar = this.o0) != null) {
            try {
                if (v instanceof String) {
                    return (V) oVar.getString(str, (String) v);
                }
                if (v instanceof Integer) {
                    return (V) Integer.valueOf(oVar.getInt(str, ((Integer) v).intValue()));
                }
                if (v instanceof Long) {
                    return (V) Long.valueOf(oVar.getLong(str, ((Long) v).longValue()));
                }
                if (v instanceof Double) {
                    return (V) Double.valueOf(oVar.o(str, ((Double) v).doubleValue()));
                }
                if (v instanceof Float) {
                    return (V) Float.valueOf(oVar.getFloat(str, ((Float) v).floatValue()));
                }
                return v instanceof Boolean ? (V) Boolean.valueOf(oVar.getBoolean(str, ((Boolean) v).booleanValue())) : (V) oVar.o0(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v;
    }

    public final boolean n() {
        return this.f42143n;
    }

    public final void o0() {
        this.f42143n = true;
        o("is_migrated", Boolean.TRUE);
    }

    @Override // com.thinkup.core.common.o0m.o
    public final <V> void o(String str, V v) {
        o(str, v, this.oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.thinkup.core.common.o0m.o
    public final <V> void o(String str, V v, int i2) {
        if (TextUtils.isEmpty(str) || v == 0 || this.o0 == null) {
            return;
        }
        try {
            String string = v.toString();
            if (v instanceof String) {
                this.o0.putString(str, (String) v);
            } else if (v instanceof Integer) {
                this.o0.putInt(str, Integer.parseInt(string));
            } else if (v instanceof Long) {
                this.o0.putLong(str, Long.parseLong(string));
            } else if (v instanceof Double) {
                this.o0.m(str, Double.parseDouble(string));
            } else if (v instanceof Float) {
                this.o0.putFloat(str, Float.parseFloat(string));
            } else if (v instanceof Boolean) {
                this.o0.putBoolean(str, Boolean.parseBoolean(string));
            }
            o(i2);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.thinkup.core.common.o0m.o
    public final void m(String str) {
        com.thinkup.core.common.o0m.o.o oVar = this.o0;
        if (oVar != null) {
            oVar.remove(str);
            o(this.oo);
        }
    }

    @Override // com.thinkup.core.common.o0m.o
    public final void m() {
        com.thinkup.core.common.o0m.o.o oVar = this.o0;
        if (oVar != null) {
            oVar.clear();
        }
    }

    @Override // com.thinkup.core.common.o0m.o
    public final Map<String, Object> o() {
        com.thinkup.core.common.o0m.o.o oVar = this.o0;
        if (oVar != null) {
            return oVar.getAll();
        }
        return null;
    }

    @Override // com.thinkup.core.common.o0m.o
    public final boolean o(String str) {
        com.thinkup.core.common.o0m.o.o oVar = this.o0;
        return oVar != null && oVar.contains(str);
    }

    private void o(int i2) {
        com.thinkup.core.common.o0m.o.o oVar = this.o0;
        if (oVar == null) {
            return;
        }
        if (oVar instanceof on) {
            i2 = ((on) oVar).mm();
        } else if ((oVar instanceof mm) && i2 == 0) {
            i2 = 1;
        }
        this.o0.getClass();
        if (i2 == 1) {
            this.o0.apply();
        } else if (i2 == 2) {
            this.o0.commit();
        }
    }
}
