package g4;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f41485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f41486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f41487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f41488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k4.a f41489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41491h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d5.e f41493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f41494k;

    public e(Context context, String str) {
        this.f41485b = context;
        this.f41484a = str;
        d5.e eVar = new d5.e();
        eVar.f38688a = new HashMap();
        this.f41493j = eVar;
    }

    public final void a(h4.a... aVarArr) {
        if (this.f41494k == null) {
            this.f41494k = new HashSet();
        }
        for (h4.a aVar : aVarArr) {
            this.f41494k.add(Integer.valueOf(aVar.f42207a));
            this.f41494k.add(Integer.valueOf(aVar.f42208b));
        }
        d5.e eVar = this.f41493j;
        eVar.getClass();
        for (h4.a aVar2 : aVarArr) {
            int i10 = aVar2.f42207a;
            int i11 = aVar2.f42208b;
            HashMap map = eVar.f38688a;
            TreeMap treeMap = (TreeMap) map.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(Integer.valueOf(i10), treeMap);
            }
            h4.a aVar3 = (h4.a) treeMap.get(Integer.valueOf(i11));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i11), aVar2);
        }
    }
}
