package com.inmobi.media;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class X5 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X5(Y5 y5, ArrayList arrayList) {
        super(1);
        this.f23340a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        String strD;
        Y6 dbData = (Y6) obj;
        Intrinsics.f(dbData, "dbData");
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3080j7.f23723a;
        String fileName = dbData.f23367a;
        Intrinsics.f(fileName, "fileName");
        Z5 z5 = null;
        try {
            Iterator it = AbstractC3080j7.f23723a.iterator();
            while (it.hasNext()) {
                Ab ab = (Ab) ((WeakReference) it.next()).get();
                if (Intrinsics.a(ab != null ? ab.j : null, fileName)) {
                    return Unit.f43263a;
                }
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
        String filePath = dbData.f23367a;
        Intrinsics.f(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            try {
                strD = FilesKt.d(file, Charsets.f44691a);
            } catch (Exception unused) {
                strD = null;
            }
        } else {
            strD = null;
        }
        if (strD != null) {
            JSONObject jSONObject = new JSONObject(strD);
            JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
            JSONArray jSONArray = jSONObject.getJSONArray("log");
            Intrinsics.c(jSONObject2);
            Intrinsics.c(jSONArray);
            z5 = new Z5(jSONObject2, jSONArray, dbData);
        }
        if (z5 != null) {
            this.f23340a.add(z5);
        }
        return Unit.f43263a;
    }
}
