package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class hw {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<Field> f2410;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private d f2411;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hz f2412;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private hz f2414;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2415;

        private d() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final hz m2317() {
            return this.f2414;
        }

        /* JADX INFO: renamed from: ﻛ */
        public boolean mo2316(Field field) {
            if (this.f2414 == null || (field.getModifiers() & this.f2414.m2324()) != this.f2414.m2324() || (field.getModifiers() & this.f2414.m2320()) != 0 || this.f2414.m2331().contains(field.getType())) {
                return false;
            }
            if (this.f2414.m2330() ? field.getType().equals(this.f2414.m2332()) : this.f2414.m2332().isAssignableFrom(field.getType())) {
                int i10 = this.f2415;
                if (i10 == 0) {
                    return true;
                }
                this.f2415 = i10 - 1;
            }
            return false;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m2318(hz hzVar) {
            this.f2414 = hzVar;
            this.f2415 = hzVar.m2329();
        }

        public /* synthetic */ d(hw hwVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static hz.d m2307() {
        return new hz.d();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field[] m2311(Class cls, hz hzVar) {
        if (hzVar != null && hzVar.m2321()) {
            return m2310(cls, hzVar.m2321(), hzVar.m2322(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final <T> Field m2312(Class cls, Class<T> cls2) {
        Field fieldM2315;
        synchronized (ke.class) {
            try {
                if (this.f2412 == null) {
                    this.f2412 = new hz();
                }
                this.f2412.m2333(cls2);
                fieldM2315 = m2315(cls, this.f2412);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fieldM2315;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Field m2313(Class cls, final String str) {
        d dVar = new d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hw.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hw.d
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final boolean mo2316(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hw.class) {
            try {
                if (this.f2410 == null) {
                    this.f2410 = new ArrayList();
                }
                this.f2410.clear();
                m2308(cls, dVar, this.f2410);
                if (this.f2410.isEmpty()) {
                    return null;
                }
                return this.f2410.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Field m2315(Class cls, hz hzVar) {
        synchronized (ke.class) {
            try {
                if (this.f2410 == null) {
                    this.f2410 = new ArrayList();
                }
                this.f2410.clear();
                m2309(cls, hzVar, this.f2410);
                if (this.f2410.isEmpty()) {
                    return null;
                }
                return this.f2410.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2308(Class cls, d dVar, List<Field> list) {
        for (Field field : m2311(cls, dVar.m2317())) {
            if (dVar.mo2316(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<Field> m2314(Class cls, hz hzVar) {
        ArrayList arrayList = new ArrayList();
        m2309(cls, hzVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2309(Class cls, hz hzVar, List<Field> list) {
        synchronized (hw.class) {
            try {
                if (this.f2411 == null) {
                    this.f2411 = new d(this);
                }
                this.f2411.m2318(hzVar);
                m2308(cls, this.f2411, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m2310(Class cls, boolean z10, int i10, List<String> list) {
        while (cls != null && !kk.m2880(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM2878 = new Field[0];
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
            fieldArrM2878 = kk.m2878(declaredFields, fields);
            if (!z10) {
                return fieldArrM2878;
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                try {
                    fieldArrM2878 = kk.m2878(fieldArrM2878, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM2878 = kk.m2878(fieldArrM2878, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM2878;
    }
}
