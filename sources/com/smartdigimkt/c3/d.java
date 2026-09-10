package com.smartdigimkt.c3;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class d implements i.d {
    private static String f = "DownLoadH5SourceListener";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentMap<String, d> f34097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f34098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<i.e> f34099c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34100e;

    public d(ConcurrentMap<String, d> concurrentMap, n nVar, i.e eVar, String str, String str2) {
        CopyOnWriteArrayList<i.e> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f34099c = copyOnWriteArrayList;
        this.f34097a = concurrentMap;
        this.f34098b = nVar;
        copyOnWriteArrayList.add(eVar);
        this.d = str;
        this.f34100e = str2;
    }

    @Override // com.smartdigimkt.c3.i.d
    public void a() {
    }

    public void a(i.e eVar) {
        this.f34099c.add(eVar);
    }

    @Override // com.smartdigimkt.c3.i.d
    public void a(String str, String str2) {
        String str3;
        String message = "";
        try {
            ConcurrentMap<String, d> concurrentMap = this.f34097a;
            if (concurrentMap == null) {
                for (i.e eVar : this.f34099c) {
                    if (eVar != null) {
                        eVar.b(str2, "mResDownloadingMap  is null");
                        this.f34099c.remove(eVar);
                    }
                }
                return;
            }
            if (concurrentMap.containsKey(this.f34100e)) {
                this.f34097a.remove(this.f34100e);
            }
            if (!TextUtils.isEmpty(str)) {
                String strA = this.f34098b.a(str2, str);
                if (TextUtils.isEmpty(strA)) {
                    for (i.e eVar2 : this.f34099c) {
                        if (eVar2 != null) {
                            eVar2.a(str2, "", false);
                            this.f34099c.remove(eVar2);
                        }
                    }
                    return;
                }
                str3 = "data save failed:" + strA;
            } else {
                str3 = "response data is error";
            }
            message = str3;
            for (i.e eVar3 : this.f34099c) {
                if (eVar3 != null) {
                    eVar3.b(str2, message);
                }
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
            try {
                message = e2.getMessage();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    @Override // com.smartdigimkt.c3.i.d
    public void a(String str) {
        try {
            ConcurrentMap<String, d> concurrentMap = this.f34097a;
            if (concurrentMap == null) {
                for (i.e eVar : this.f34099c) {
                    if (eVar != null) {
                        eVar.b(this.d, "mResDownloadingMap  is null");
                        this.f34099c.remove(eVar);
                    }
                }
                return;
            }
            if (concurrentMap.containsKey(this.f34100e)) {
                this.f34097a.remove(this.f34100e);
            }
            for (i.e eVar2 : this.f34099c) {
                if (eVar2 != null) {
                    eVar2.b(this.d, str);
                    this.f34099c.remove(eVar2);
                }
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
            try {
                str = e2.getMessage();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
