package com.smartdigimkt.t;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38601b = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f38602c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SharedPreferences f38603a;

    private a() {
    }

    public static a b() {
        if (f38602c == null) {
            synchronized (a.class) {
                try {
                    if (f38602c == null) {
                        f38602c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38602c;
    }

    public void a(String str, String str2) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            if (contextD == null) {
                return;
            }
            if (this.f38603a == null) {
                this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
            }
            SharedPreferences.Editor editorEdit = this.f38603a.edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public Long c(String str) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            if (contextD == null) {
                return 0L;
            }
            if (this.f38603a == null) {
                this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
            }
            return Long.valueOf(this.f38603a.getLong(str, 0L));
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public void d(String str) {
        Context contextD = com.smartdigimkt.u.a.f().d();
        if (contextD == null) {
            return;
        }
        if (this.f38603a == null) {
            this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
        }
        this.f38603a.edit().remove(str).apply();
    }

    public void b(String str, int i2) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            if (contextD == null) {
                return;
            }
            if (this.f38603a == null) {
                this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
            }
            SharedPreferences.Editor editorEdit = this.f38603a.edit();
            editorEdit.putInt(str, i2);
            editorEdit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(String str, long j) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            if (contextD == null) {
                return;
            }
            if (this.f38603a == null) {
                this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
            }
            SharedPreferences.Editor editorEdit = this.f38603a.edit();
            editorEdit.putLong(str, j);
            editorEdit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int b(String str) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            if (contextD == null) {
                return 0;
            }
            if (this.f38603a == null) {
                this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
            }
            return this.f38603a.getInt(str, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public int a(String str, int i2) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            if (contextD == null) {
                return i2;
            }
            if (this.f38603a == null) {
                this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
            }
            return this.f38603a.getInt(str, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return i2;
        }
    }

    public String a(String str) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            if (contextD == null) {
                return null;
            }
            if (this.f38603a == null) {
                this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
            }
            return this.f38603a.getString(str, "");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        Context contextD = com.smartdigimkt.u.a.f().d();
        if (contextD == null) {
            return null;
        }
        if (this.f38603a == null) {
            this.f38603a = contextD.getSharedPreferences(com.smartdigimkt.b0.a.s, 0);
        }
        Iterator<Map.Entry<String, ?>> it = this.f38603a.getAll().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }
}
