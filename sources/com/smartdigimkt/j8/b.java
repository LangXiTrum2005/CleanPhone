package com.smartdigimkt.j8;

import android.text.TextUtils;
import com.smartdigimkt.h8.g;
import com.smartdigimkt.h8.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.smartdigimkt.g8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f36115e = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.h8.a f36118c;
    private final int d;

    public b(com.smartdigimkt.g8.d dVar) {
        this.f36118c = a(dVar);
        this.d = dVar.d();
        this.f36116a = dVar.b();
    }

    private com.smartdigimkt.h8.a a(com.smartdigimkt.g8.d dVar) {
        j.c cVar = new j.c(dVar.a(), dVar.b());
        cVar.a(false);
        return cVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.g8.a
    public <V> V b(String str, V v) {
        com.smartdigimkt.h8.a aVar;
        if (!TextUtils.isEmpty(str) && v != 0 && (aVar = this.f36118c) != null) {
            try {
                if (v instanceof String) {
                    return (V) aVar.getString(str, (String) v);
                }
                if (v instanceof Integer) {
                    return (V) Integer.valueOf(aVar.getInt(str, ((Integer) v).intValue()));
                }
                if (v instanceof Long) {
                    return (V) Long.valueOf(aVar.getLong(str, ((Long) v).longValue()));
                }
                if (v instanceof Double) {
                    return (V) Double.valueOf(aVar.a(str, ((Double) v).doubleValue()));
                }
                if (v instanceof Float) {
                    return (V) Float.valueOf(aVar.getFloat(str, ((Float) v).floatValue()));
                }
                return v instanceof Boolean ? (V) Boolean.valueOf(aVar.getBoolean(str, ((Boolean) v).booleanValue())) : (V) aVar.j(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v;
    }

    @Override // com.smartdigimkt.g8.a
    public void clear() {
        com.smartdigimkt.h8.a aVar = this.f36118c;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // com.smartdigimkt.g8.a
    public boolean contains(String str) {
        com.smartdigimkt.h8.a aVar = this.f36118c;
        return aVar != null && aVar.contains(str);
    }

    @Override // com.smartdigimkt.g8.a
    public Map<String, Object> getAll() {
        com.smartdigimkt.h8.a aVar = this.f36118c;
        if (aVar != null) {
            return aVar.getAll();
        }
        return null;
    }

    @Override // com.smartdigimkt.g8.a
    public void remove(String str) {
        com.smartdigimkt.h8.a aVar = this.f36118c;
        if (aVar != null) {
            aVar.remove(str);
            a(this.d);
        }
    }

    @Override // com.smartdigimkt.g8.a
    public <V> void a(String str, V v) {
        a(str, v, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.g8.a
    public <V> void a(String str, V v, int i2) {
        if (TextUtils.isEmpty(str) || v == 0 || this.f36118c == null) {
            return;
        }
        try {
            String string = v.toString();
            if (v instanceof String) {
                this.f36118c.putString(str, (String) v);
            } else if (v instanceof Integer) {
                this.f36118c.putInt(str, Integer.parseInt(string));
            } else if (v instanceof Long) {
                this.f36118c.putLong(str, Long.parseLong(string));
            } else if (v instanceof Double) {
                this.f36118c.b(str, Double.parseDouble(string));
            } else if (v instanceof Float) {
                this.f36118c.putFloat(str, Float.parseFloat(string));
            } else if (v instanceof Boolean) {
                this.f36118c.putBoolean(str, Boolean.parseBoolean(string));
            }
            a(i2);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void a(boolean z2) {
        this.f36117b = z2;
        a("is_migrated", Boolean.valueOf(z2));
    }

    private void a(int i2) {
        com.smartdigimkt.h8.a aVar = this.f36118c;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof g) {
            i2 = ((g) aVar).s();
        } else if ((aVar instanceof j) && i2 == 0) {
            i2 = 1;
        }
        this.f36118c.getClass();
        if (i2 == 1) {
            this.f36118c.apply();
        } else if (i2 == 2) {
            this.f36118c.commit();
        }
    }
}
