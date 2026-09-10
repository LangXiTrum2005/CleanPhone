package com.smartdigimkt.l;

import com.thinkup.core.common.n.mo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f36289b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<c.b.a> f36290a;

    public a(String str) {
        super(str);
        this.f36290a = new ArrayList();
    }

    public void a(c.b.a aVar) {
        this.f36290a.add(aVar);
    }

    public List<c.b.a> b() {
        return this.f36290a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (c.b.a aVar : this.f36290a) {
            sb.append(aVar.toString());
            sb.append(";");
            try {
                int i2 = 0;
                if (aVar.getCause() instanceof NoSuchFieldException) {
                    Field[] declaredFields = aVar.b().getDeclaredFields();
                    sb.append(aVar.b().getName());
                    sb.append(mo.ono);
                    sb.append(aVar.c());
                    sb.append(";");
                    while (i2 < declaredFields.length) {
                        sb.append(declaredFields[i2].getName());
                        sb.append("/");
                        i2++;
                    }
                } else if (aVar.getCause() instanceof NoSuchMethodException) {
                    Method[] declaredMethods = aVar.b().getDeclaredMethods();
                    sb.append(aVar.b().getName());
                    sb.append("->");
                    sb.append(aVar.d());
                    sb.append(";");
                    while (i2 < declaredMethods.length) {
                        if (aVar.d().equals(declaredMethods[i2].getName())) {
                            sb.append(declaredMethods[i2].toGenericString());
                            sb.append("/");
                        }
                        i2++;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            sb.append("@@@@");
        }
        return sb.toString();
    }

    public void a(List<c.b.a> list) {
        this.f36290a.addAll(list);
    }

    public static a a(a aVar, a aVar2) {
        if (aVar == null) {
            return aVar2;
        }
        if (aVar2 == null) {
            return aVar;
        }
        a aVar3 = new a(aVar.getMessage() + ";" + aVar2.getMessage());
        aVar3.a(aVar.b());
        aVar3.a(aVar2.b());
        return aVar3;
    }
}
