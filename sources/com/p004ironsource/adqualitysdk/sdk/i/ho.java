package com.p004ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ho {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private a f2271;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<Field> f2272;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hp f2273;

    public class a {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f2275;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private hp f2276;

        private a() {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void m2220(hp hpVar) {
            this.f2276 = hpVar;
            this.f2275 = hpVar.m2228();
        }

        /* JADX INFO: renamed from: ｋ */
        public boolean mo2219(Field field) {
            if (this.f2276 == null || (field.getModifiers() & this.f2276.m2202()) != this.f2276.m2202() || (field.getModifiers() & this.f2276.m2204()) != 0 || this.f2276.m2229().contains(field.getType())) {
                return false;
            }
            if (this.f2276.m2227() ? field.getType().equals(this.f2276.m2226()) : this.f2276.m2226().isAssignableFrom(field.getType())) {
                int i2 = this.f2275;
                if (i2 == 0) {
                    return true;
                }
                this.f2275 = i2 - 1;
            }
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final hp m2221() {
            return this.f2276;
        }

        public /* synthetic */ a(ho hoVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m2214(Class cls, boolean z2, int i2, List<String> list) {
        while (cls != null && !jz.m2718(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM2735 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM2735 = jz.m2735(declaredFields, fields);
            if (!z2) {
                return fieldArrM2735;
            }
            Class superclass = cls.getSuperclass();
            for (int i3 = 0; superclass != null && i3 != i2; i3++) {
                try {
                    fieldArrM2735 = jz.m2735(fieldArrM2735, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM2735 = jz.m2735(fieldArrM2735, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM2735;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final <T> Field m2215(Class cls, Class<T> cls2) {
        Field fieldM2216;
        synchronized (ju.class) {
            try {
                if (this.f2273 == null) {
                    this.f2273 = new hp();
                }
                this.f2273.m2230(cls2);
                fieldM2216 = m2216(cls, this.f2273);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fieldM2216;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Field m2216(Class cls, hp hpVar) {
        synchronized (ju.class) {
            try {
                if (this.f2272 == null) {
                    this.f2272 = new ArrayList();
                }
                this.f2272.clear();
                m2213(cls, hpVar, this.f2272);
                if (this.f2272.isEmpty()) {
                    return null;
                }
                return this.f2272.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Field m2217(Class cls, final String str) {
        a aVar = new a(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ho.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ho.a
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final boolean mo2219(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (ho.class) {
            try {
                if (this.f2272 == null) {
                    this.f2272 = new ArrayList();
                }
                this.f2272.clear();
                m2210(cls, aVar, this.f2272);
                if (this.f2272.isEmpty()) {
                    return null;
                }
                return this.f2272.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2210(Class cls, a aVar, List<Field> list) {
        for (Field field : m2211(cls, aVar.m2221())) {
            if (aVar.mo2219(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2213(Class cls, hp hpVar, List<Field> list) {
        synchronized (ho.class) {
            try {
                if (this.f2271 == null) {
                    this.f2271 = new a(this);
                }
                this.f2271.m2220(hpVar);
                m2210(cls, this.f2271, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<Field> m2218(Class cls, hp hpVar) {
        ArrayList arrayList = new ArrayList();
        m2213(cls, hpVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2211(Class cls, hp hpVar) {
        if (hpVar != null && hpVar.m2205()) {
            return m2214(cls, hpVar.m2205(), hpVar.m2203(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static hp.e m2212() {
        return new hp.e();
    }
}
