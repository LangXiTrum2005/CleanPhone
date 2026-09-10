package com.efs.sdk.memleaksdk.monitor;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import com.efs.sdk.memleaksdk.monitor.internal.aa;
import com.efs.sdk.memleaksdk.monitor.internal.ah;
import com.efs.sdk.memleaksdk.monitor.internal.ak;
import com.efs.sdk.memleaksdk.monitor.internal.al;
import com.efs.sdk.memleaksdk.monitor.internal.ar;
import com.efs.sdk.memleaksdk.monitor.internal.at;
import com.efs.sdk.memleaksdk.monitor.internal.au;
import com.efs.sdk.memleaksdk.monitor.internal.av;
import com.efs.sdk.memleaksdk.monitor.internal.ay;
import com.efs.sdk.memleaksdk.monitor.internal.bc;
import com.efs.sdk.memleaksdk.monitor.internal.bg;
import com.efs.sdk.memleaksdk.monitor.internal.bi;
import com.efs.sdk.memleaksdk.monitor.internal.bk;
import com.efs.sdk.memleaksdk.monitor.internal.bp;
import com.efs.sdk.memleaksdk.monitor.internal.bs;
import com.efs.sdk.memleaksdk.monitor.internal.e;
import com.efs.sdk.memleaksdk.monitor.internal.g;
import com.efs.sdk.memleaksdk.monitor.internal.z;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class UMonitorService extends IntentService {
    private static final String ACTIVITY_CLASS_NAME = "android.app.Activity";
    private static final String ANDROIDX_FRAGMENT_CLASS_NAME = "androidx.fragment.app.Fragment";
    private static final String CURRENT_PAGE = "CURRENT_PAGE";
    private static final String DESTROYED_FIELD_NAME = "mDestroyed";
    private static final String FD = "FD";
    private static final String FINISHED_FIELD_NAME = "mFinished";
    private static final String FRAGMENT_MANAGER_FIELD_NAME = "mFragmentManager";
    private static final String FRAGMENT_MCALLED_FIELD_NAME = "mCalled";
    public static final String HPROF_FILE = "HPROF_FILE";
    public static final String JSON_FILE = "JSON_FILE";
    private static final String MANUFACTURE = "MANUFACTURE";
    private static final String MODEL = "MODEL";
    private static final String NATIVE_FRAGMENT_CLASS_NAME = "android.app.Fragment";
    private static final String REASON = "REASON";
    public static final String RESULT_RECEIVER = "RESULT_RECEIVER";
    public static final String ROOT_PATH = "ROOT_PATH";
    private static final String SDK = "SDK";
    private static final String SUPPORT_FRAGMENT_CLASS_NAME = "androidx.fragment.app.Fragment";
    private static final String TAG = "UMonitor.Service";
    private static final String THREAD = "THREAD";
    private static final String TIME = "TIME";
    private static final String USAGE_TIME = "USAGE_TIME";
    private au mHeapGraph;
    private final aa mLeakModel;
    private final Map<Long, String> mLeakReasonTable;
    private final Set<Long> mLeakingObjectIds;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f448a;
        int b;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public UMonitorService() {
        super("UMonitorService");
        this.mLeakModel = new aa();
        this.mLeakingObjectIds = new HashSet();
        this.mLeakReasonTable = new HashMap();
    }

    private void buildIndex(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        g.b(TAG, "start analyze");
        HashSet hashSet = new HashSet();
        hashSet.add(bc.ROOT_JNI_GLOBAL);
        hashSet.add(bc.ROOT_JNI_LOCAL);
        hashSet.add(bc.ROOT_NATIVE_STACK);
        hashSet.add(bc.ROOT_STICKY_CLASS);
        hashSet.add(bc.ROOT_THREAD_BLOCK);
        hashSet.add(bc.ROOT_THREAD_OBJECT);
        this.mHeapGraph = ay.f574a.a(new File(str), (bs) null, hashSet);
    }

    private void buildJson(Intent intent) throws Throwable {
        if (intent == null) {
            return;
        }
        final aa.c cVar = new aa.c();
        this.mLeakModel.f450a = cVar;
        cVar.f454a = intent.getStringExtra(THREAD);
        cVar.b = intent.getStringExtra(FD);
        cVar.e = intent.getStringExtra(SDK);
        cVar.f = intent.getStringExtra(MANUFACTURE);
        cVar.g = intent.getStringExtra(MODEL);
        cVar.j = intent.getStringExtra(USAGE_TIME);
        cVar.i = intent.getStringExtra(CURRENT_PAGE);
        cVar.k = intent.getStringExtra(TIME);
        cVar.l = intent.getStringExtra(REASON);
        File fileA = e.a(e.e());
        e.a(fileA, new e.a() { // from class: com.efs.sdk.memleaksdk.monitor.UMonitorService.1
            @Override // com.efs.sdk.memleaksdk.monitor.internal.e.a
            public boolean a(String str) {
                cVar.d.add(str);
                return true;
            }
        });
        fileA.delete();
        File fileA2 = e.a(e.d());
        e.a(fileA2, new e.a() { // from class: com.efs.sdk.memleaksdk.monitor.UMonitorService.2
            @Override // com.efs.sdk.memleaksdk.monitor.internal.e.a
            public boolean a(String str) {
                cVar.c.add(str);
                return true;
            }
        });
        fileA2.delete();
    }

    private void fillJsonFile(String str) throws Throwable {
        try {
            e.a(new File(str), this.mLeakModel.b().toString());
        } catch (Exception e) {
            g.b(TAG, "json write failed", e);
        }
    }

    private void filterLeakingObjects() {
        at atVarB;
        at atVarB2;
        Boolean boolA;
        at atVarB3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g.b(TAG, "filterLeakingObjects " + Thread.currentThread());
        au auVar = this.mHeapGraph;
        if (auVar == null) {
            return;
        }
        av.b bVarA = auVar.a(ACTIVITY_CLASS_NAME);
        av.b bVarA2 = this.mHeapGraph.a("androidx.fragment.app.Fragment");
        if (bVarA2 == null && (bVarA2 = this.mHeapGraph.a(NATIVE_FRAGMENT_CLASS_NAME)) == null) {
            bVarA2 = this.mHeapGraph.a("androidx.fragment.app.Fragment");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = this.mHeapGraph.e().iterator();
        while (it.hasNext()) {
            av.c cVar = (av.c) it.next();
            if (!cVar.f()) {
                long j = cVar.c.f643a;
                Pair pairCreate = (Pair) linkedHashMap.get(Long.valueOf(j));
                if (pairCreate == null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = cVar.i().k().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                    pairCreate = Pair.create(Long.valueOf(arrayList.size() >= 2 ? ((av.b) DM.e(arrayList, 2)).a() : 0L), Long.valueOf(arrayList.size() >= 5 ? ((av.b) DM.e(arrayList, 5)).a() : 0L));
                    linkedHashMap.put(Long.valueOf(j), pairCreate);
                } else {
                    it = it;
                }
                if (bVarA != null && bVarA.a() == ((Long) pairCreate.second).longValue()) {
                    at atVarB4 = cVar.b(ACTIVITY_CLASS_NAME, DESTROYED_FIELD_NAME);
                    if (atVarB4 != null && (atVarB3 = cVar.b(ACTIVITY_CLASS_NAME, FINISHED_FIELD_NAME)) != null) {
                        Boolean boolA2 = atVarB4.c.a();
                        Boolean boolA3 = atVarB3.c.a();
                        Boolean bool = Boolean.TRUE;
                        if (boolA2 == bool || boolA3 == bool) {
                            updateClassObjectCounterMap(linkedHashMap2, j, true);
                            g.b(TAG, "activity name : " + cVar.h() + " mDestroyed:" + boolA2 + " mFinished:" + boolA3 + " objectId:" + (cVar.a() & 4294967295L));
                            this.mLeakingObjectIds.add(Long.valueOf(cVar.a()));
                            this.mLeakReasonTable.put(Long.valueOf(cVar.a()), "Activity Leak");
                            StringBuilder sb = new StringBuilder();
                            sb.append(cVar.h());
                            sb.append(" objectId:");
                            sb.append(cVar.a());
                            g.b(TAG, sb.toString());
                        }
                    }
                } else if (bVarA2 != null && bVarA2.a() == ((Long) pairCreate.first).longValue() && (atVarB = cVar.b(bVarA2.f(), FRAGMENT_MANAGER_FIELD_NAME)) != null && atVarB.c.f() != null && (atVarB2 = cVar.b(bVarA2.f(), FRAGMENT_MCALLED_FIELD_NAME)) != null && (boolA = atVarB2.c.a()) != null) {
                    updateClassObjectCounterMap(linkedHashMap2, j, boolA.booleanValue());
                    g.b(TAG, "fragment name:" + cVar.h() + " isLeak:" + boolA);
                    if (boolA.booleanValue()) {
                        this.mLeakingObjectIds.add(Long.valueOf(cVar.a()));
                        this.mLeakReasonTable.put(Long.valueOf(cVar.a()), "Fragment Leak");
                        g.b(TAG, cVar.h() + " objectId:" + cVar.a());
                    }
                }
                it = it;
                jCurrentTimeMillis = jCurrentTimeMillis;
            }
        }
        long j2 = jCurrentTimeMillis;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            aa.a aVar = new aa.a();
            av.b bVarD = this.mHeapGraph.a(((Long) entry.getKey()).longValue()).d();
            if (bVarD != null) {
                aVar.f451a = bVarD.f();
            }
            aVar.b = AbstractC5044xl.o(new StringBuilder(), ((a) entry.getValue()).f448a, "");
            this.mLeakModel.c.add(aVar);
            Locale locale = Locale.US;
            g.b(TAG, "class: " + aVar.f451a + ", leak count:" + aVar.b);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        aa.c cVar2 = this.mLeakModel.f450a;
        if (cVar2 != null) {
            cVar2.o = ((jCurrentTimeMillis2 - j2) / 1000.0f) + "";
        }
        g.b(TAG, "filter leaking objects cost: " + ((jCurrentTimeMillis2 - j2) / 1000.0f) + com.umeng.analytics.pro.bc.aH);
    }

    private void findPathsToGcRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ar.c cVarA = new ar(new bp() { // from class: com.efs.sdk.memleaksdk.monitor.UMonitorService.3
            @Override // com.efs.sdk.memleaksdk.monitor.internal.bp
            public void a(bp.b bVar) {
                g.b(UMonitorService.TAG, "heap analysis start: " + bVar.name());
            }
        }).a(new ar.a(this.mHeapGraph, ak.b(), true, new ArrayList()), this.mLeakingObjectIds);
        g.b(TAG, "size: " + cVarA.f555a.size());
        for (al alVar : cVarA.f555a) {
            g.b(TAG, alVar.b() + ", signature:" + alVar.a() + ", trace size:" + alVar.c().size());
            List<bg> listC = alVar.c();
            if (!listC.isEmpty()) {
                bg bgVar = listC.get(0);
                String str = bgVar.f602a.j;
                bi biVar = bgVar.c;
                Set<String> set = biVar.c;
                bgVar.c.a(String.valueOf(this.mLeakReasonTable.get(Long.valueOf(biVar.f607a))));
                g.b(TAG, str + ", class:" + bgVar.c.b + ", type:" + bgVar.c.b() + ", labels:" + set + ", reason:" + bgVar.c.e + ", objId:" + (bgVar.c.f607a & 4294967295L));
                aa.b bVar = new aa.b();
                bVar.c = str;
                bi biVar2 = bgVar.c;
                bVar.d = biVar2.b;
                bVar.b = biVar2.e;
                bVar.e = alVar.a();
                StringBuilder sb = new StringBuilder("signature origin: \n");
                sb.append(alVar.c().get(0).toString());
                g.b(TAG, sb.toString());
                bVar.f452a = Integer.valueOf(alVar.c().size());
                this.mLeakModel.b.add(bVar);
                for (bk bkVar : bgVar.b) {
                    String str2 = bkVar.f611a.b;
                    String strB = bkVar.b();
                    aa.b.a aVar = new aa.b.a();
                    if (strB.startsWith("[")) {
                        StringBuilder sbU = AbstractC3950lJ.u("array ", str2, ".[");
                        sbU.append(bkVar.f611a.g);
                        sbU.append("]");
                        aVar.f453a = sbU.toString();
                    } else {
                        aVar.f453a = DM.i(str2, ".", strB);
                    }
                    g.a(TAG, "\t" + aVar.f453a);
                    bVar.g.add(aVar);
                }
                aa.b.a aVar2 = new aa.b.a();
                aVar2.f453a = bgVar.c.b;
                bVar.f = bgVar.c.f + "";
                bVar.g.add(aVar2);
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        aa.c cVar = this.mLeakModel.f450a;
        if (cVar != null) {
            cVar.p = ((jCurrentTimeMillis2 - jCurrentTimeMillis) / 1000.0f) + "";
        }
        g.b(TAG, "find paths to GcRoot cost: " + ((jCurrentTimeMillis2 - jCurrentTimeMillis) / 1000.0f) + com.umeng.analytics.pro.bc.aH);
    }

    public static void startAnalysisService(Context context, String str, String str2, z zVar, UMonitorHeapResult.a aVar) {
        try {
            g.b(TAG, "startService");
            UMonitorHeapResult uMonitorHeapResult = new UMonitorHeapResult();
            uMonitorHeapResult.a(aVar);
            Intent intent = new Intent(context, (Class<?>) UMonitorService.class);
            intent.putExtra(HPROF_FILE, str);
            intent.putExtra(JSON_FILE, str2);
            intent.putExtra(ROOT_PATH, e.a().getPath());
            intent.putExtra(RESULT_RECEIVER, uMonitorHeapResult);
            File[] fileArrListFiles = new File("/proc/self/fd").listFiles();
            intent.putExtra(FD, String.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            intent.putExtra(THREAD, String.valueOf(ah.e.f458a));
            intent.putExtra(MANUFACTURE, Build.MANUFACTURER);
            intent.putExtra(SDK, String.valueOf(Build.VERSION.SDK_INT));
            intent.putExtra(MODEL, Build.MODEL);
            intent.putExtra(TIME, new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(new Date()));
            String str3 = zVar.f701a;
            if (str3 != null) {
                intent.putExtra(REASON, str3);
            }
            String str4 = zVar.c;
            if (str4 != null) {
                intent.putExtra(CURRENT_PAGE, str4);
            }
            String str5 = zVar.b;
            if (str5 != null) {
                intent.putExtra(USAGE_TIME, str5);
            }
            context.startService(intent);
        } catch (Throwable th) {
            g.b(TAG, "startAnalysisService", th);
        }
    }

    private a updateClassObjectCounterMap(Map<Long, a> map, long j, boolean z) {
        a aVar = map.get(Long.valueOf(j));
        if (aVar == null) {
            aVar = new a((byte) 0);
            map.put(Long.valueOf(j), aVar);
        }
        aVar.f448a++;
        if (z) {
            aVar.b++;
        }
        return aVar;
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(RESULT_RECEIVER);
        try {
            String stringExtra = intent.getStringExtra(HPROF_FILE);
            String stringExtra2 = intent.getStringExtra(JSON_FILE);
            e.a(getApplicationContext(), intent.getStringExtra(ROOT_PATH));
            buildIndex(stringExtra);
            buildJson(intent);
            filterLeakingObjects();
            findPathsToGcRoot();
            if (this.mLeakModel.a()) {
                fillJsonFile(stringExtra2);
                if (resultReceiver != null) {
                    resultReceiver.send(1001, null);
                }
            } else {
                g.b(TAG, "not found leak");
                if (resultReceiver != null) {
                    resultReceiver.send(PointerIconCompat.TYPE_HELP, null);
                }
            }
        } catch (Throwable th) {
            g.b(TAG, "onHandleIntent", th);
            if (resultReceiver != null) {
                try {
                    resultReceiver.send(1002, null);
                } catch (Throwable th2) {
                    g.b(TAG, "send result failed", th2);
                }
            }
        }
        System.exit(0);
    }
}
