package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l11 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l11(int i10, ak.f fVar, int i11) {
        super(i10, fVar);
        this.f16645f = i11;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f16645f) {
            case 0:
                return new l11(2, fVar, 0);
            case 1:
                return new l11(2, fVar, 1);
            case 2:
                return new l11(2, fVar, 2);
            case 3:
                return new l11(2, fVar, 3);
            case 4:
                return new l11(2, fVar, 4);
            case 5:
                return new l11(2, fVar, 5);
            case 6:
                return new l11(2, fVar, 6);
            default:
                return new l11(2, fVar, 7);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16645f) {
            case 0:
                return ((l11) create((f11) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 1:
                l11 l11Var = (l11) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar = wj.r.f53297a;
                l11Var.invokeSuspend(rVar);
                return rVar;
            case 2:
                l11 l11Var2 = (l11) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar2 = wj.r.f53297a;
                l11Var2.invokeSuspend(rVar2);
                return rVar2;
            case 3:
                return ((l11) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 4:
                return ((l11) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 5:
                return ((l11) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 6:
                return ((l11) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            default:
                l11 l11Var3 = (l11) create((fn.f) obj, (ak.f) obj2);
                wj.r rVar3 = wj.r.f53297a;
                l11Var3.invokeSuspend(rVar3);
                return rVar3;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        File parentFile;
        int i10 = this.f16645f;
        Object obj2 = xj.w.f53867a;
        wj.r rVar = wj.r.f53297a;
        switch (i10) {
            case 0:
                t9.e.z(obj);
                f11 f11VarC = f11.C();
                kotlin.jvm.internal.n.e(f11VarC, "getDefaultInstance(...)");
                return f11VarC;
            case 1:
                t9.e.z(obj);
                Log.i("ProjectLogger", "AssetProcessingStorageService: All pending saves completed");
                return rVar;
            case 2:
                t9.e.z(obj);
                gh.b bVar = gh.b.f41895a;
                File[] fileArr = {new File(bVar.h().getFilesDir(), gh.b.a().a()), new File(bVar.h().getFilesDir(), gh.b.d().a()), new File(bVar.h().getFilesDir(), gh.b.b().a())};
                for (int i11 = 0; i11 < 3; i11++) {
                    File file = fileArr[i11];
                    if (!file.exists() && (parentFile = file.getParentFile()) != null) {
                        parentFile.mkdirs();
                    }
                    File file2 = new File(file.getParentFile(), wi.d.h(file.getName(), ".tmp"));
                    if (file2.exists()) {
                        String message = "FileStorage: Cleaning up orphan temp file: " + file2.getName();
                        kotlin.jvm.internal.n.f(message, "message");
                        Log.w("ProjectLogger", message);
                        file2.delete();
                    }
                }
                return rVar;
            case 3:
                t9.e.z(obj);
                gh.b bVar2 = gh.b.f41895a;
                t9.e.f(gh.b.a());
                t9.e.f(gh.b.d());
                return new wj.h(t9.e.f(gh.b.b()));
            case 4:
                t9.e.z(obj);
                try {
                    File file3 = new File(gh.b.f41895a.h().getFilesDir(), gh.b.a().a());
                    if (file3.exists()) {
                        obj2 = go.c.B(file3).f42352a;
                    } else {
                        Log.i("ProjectLogger", "FileStorage: assets.json does not exist, returning empty");
                    }
                    break;
                } catch (Exception e10) {
                    Log.e("ProjectLogger", "File Storage: Error reading assets", e10);
                }
                return obj2;
            case 5:
                t9.e.z(obj);
                try {
                    File file4 = new File(gh.b.f41895a.h().getFilesDir(), gh.b.b().a());
                    return !file4.exists() ? obj2 : go.k.R(file4).f42353a;
                } catch (Exception e11) {
                    Log.e("ProjectLogger", "File Storage: Error reading duplicates", e11);
                    return obj2;
                }
            case 6:
                Object obj3 = xj.v.f53866a;
                t9.e.z(obj);
                try {
                    File file5 = new File(gh.b.f41895a.h().getFilesDir(), gh.b.d().a());
                    if (file5.exists()) {
                        obj3 = d0.c.E(file5).f42350a;
                    } else {
                        Log.i("ProjectLogger", "FileStorage: folders.json does not exist, returning empty");
                    }
                    break;
                } catch (Exception e12) {
                    Log.e("ProjectLogger", "File Storage: Error reading folders", e12);
                }
                return obj3;
            default:
                t9.e.z(obj);
                return rVar;
        }
    }
}
