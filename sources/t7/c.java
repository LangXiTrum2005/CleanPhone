package t7;

import b2.j;
import cc.a2;
import com.bumptech.glide.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import q7.e0;
import xj.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f50559a = new AtomicBoolean(false);

    public static final void a() {
        File[] fileArrListFiles;
        if (v7.a.b(c.class)) {
            return;
        }
        try {
            if (e0.u()) {
                return;
            }
            File fileT = a2.t();
            if (fileT == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileT.listFiles(new fc.a(4));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(android.support.v4.media.session.a.C(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((s7.c) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            List listI0 = n.I0(arrayList2, new j(19));
            JSONArray jSONArray = new JSONArray();
            pk.b it = d.O(0, Math.min(listI0.size(), 5)).iterator();
            while (it.f48398c) {
                jSONArray.put(listI0.get(it.nextInt()));
            }
            a2.J("anr_reports", jSONArray, new b(listI0, 0));
        } catch (Throwable th2) {
            v7.a.a(c.class, th2);
        }
    }
}
