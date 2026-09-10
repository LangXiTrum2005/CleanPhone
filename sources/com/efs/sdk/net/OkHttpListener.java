package com.efs.sdk.net;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.net.a.a;
import com.efs.sdk.net.a.b;
import com.efs.sdk.net.a.c;
import com.efs.sdk.net.a.d;
import com.efs.sdk.net.a.e;
import com.efs.sdk.net.a.f;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3657hz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5021xZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5106yW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2409Fc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2839Vr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3722ij;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KX;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpListener extends AbstractC2865Wr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f713a = new AtomicInteger(0);
    private boolean b;
    private List c = new ArrayList();

    private static void a(InterfaceC2409Fc interfaceC2409Fc, String str) {
        Map<String, Long> map;
        try {
            f fVarA = e.a(interfaceC2409Fc);
            if (fVarA == null) {
                return;
            }
            d dVarC = a.a().c(fVarA.f728a);
            if (dVarC == null || (map = dVarC.E) == null) {
                return;
            }
            map.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static InterfaceC2839Vr get() {
        return new InterfaceC2839Vr() { // from class: com.efs.sdk.net.OkHttpListener.1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2839Vr
            public final AbstractC2865Wr create(InterfaceC2409Fc interfaceC2409Fc) {
                return new OkHttpListener();
            }
        };
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void callEnd(InterfaceC2409Fc interfaceC2409Fc) {
        super.callEnd(interfaceC2409Fc);
        try {
            Log.d("NetTrace-Listener", "callEnd");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.b);
            a(interfaceC2409Fc);
            e.b(interfaceC2409Fc);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void callFailed(InterfaceC2409Fc interfaceC2409Fc, IOException iOException) {
        super.callFailed(interfaceC2409Fc, iOException);
        try {
            Log.d("NetTrace-Listener", "callFailed");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callFailed net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.c);
            a(interfaceC2409Fc);
            e.b(interfaceC2409Fc);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void callStart(InterfaceC2409Fc interfaceC2409Fc) {
        super.callStart(interfaceC2409Fc);
        try {
            Log.d("NetTrace-Listener", "callStart");
            if (NetManager.getNetConfigManager() != null && NetManager.getNetConfigManager().enableTracer()) {
                this.b = true;
            }
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            e.a(interfaceC2409Fc, new f(String.valueOf(f713a.getAndIncrement()), System.currentTimeMillis()));
            a(interfaceC2409Fc, d.f726a);
            try {
                f fVarA = e.a(interfaceC2409Fc);
                if (fVarA == null) {
                    return;
                }
                d dVarC = a.a().c(fVarA.f728a);
                if (dVarC != null) {
                    dVarC.B = ((IX) interfaceC2409Fc).b.f3175a.i;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void connectEnd(InterfaceC2409Fc interfaceC2409Fc, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC5106yW enumC5106yW) {
        super.connectEnd(interfaceC2409Fc, inetSocketAddress, proxy, enumC5106yW);
        try {
            Log.d("NetTrace-Listener", "connectEnd");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void connectFailed(InterfaceC2409Fc interfaceC2409Fc, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC5106yW enumC5106yW, IOException iOException) {
        super.connectFailed(interfaceC2409Fc, inetSocketAddress, proxy, enumC5106yW, iOException);
        try {
            Log.d("NetTrace-Listener", "connectFailed");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectFailed net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.j);
            a(interfaceC2409Fc);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void connectStart(InterfaceC2409Fc interfaceC2409Fc, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(interfaceC2409Fc, inetSocketAddress, proxy);
        try {
            Log.d("NetTrace-Listener", "connectStart");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectStart net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void connectionAcquired(InterfaceC2409Fc interfaceC2409Fc, InterfaceC3722ij interfaceC3722ij) {
        super.connectionAcquired(interfaceC2409Fc, interfaceC3722ij);
        try {
            Log.d("NetTrace-Listener", "connectionAcquired");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            Socket socket = ((KX) interfaceC3722ij).d;
            AbstractC2995aW.n(socket);
            InetAddress inetAddress = socket.getInetAddress();
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                try {
                    f fVarA = e.a(interfaceC2409Fc);
                    if (fVarA == null) {
                        return;
                    }
                    d dVarC = a.a().c(fVarA.f728a);
                    if (dVarC != null) {
                        dVarC.C = hostAddress;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void dnsEnd(InterfaceC2409Fc interfaceC2409Fc, String str, List<InetAddress> list) {
        super.dnsEnd(interfaceC2409Fc, str, list);
        try {
            Log.d("NetTrace-Listener", "dnsEnd");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void dnsStart(InterfaceC2409Fc interfaceC2409Fc, String str) {
        super.dnsStart(interfaceC2409Fc, str);
        try {
            Log.d("NetTrace-Listener", "dnsStart");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsStart net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void requestBodyEnd(InterfaceC2409Fc interfaceC2409Fc, long j) {
        super.requestBodyEnd(interfaceC2409Fc, j);
        try {
            Log.d("NetTrace-Listener", "requestBodyEnd");
            ((IX) interfaceC2409Fc).b.getClass();
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.n);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void requestBodyStart(InterfaceC2409Fc interfaceC2409Fc) {
        super.requestBodyStart(interfaceC2409Fc);
        try {
            Log.d("NetTrace-Listener", "requestBodyStart");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyStart net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.m);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void requestHeadersEnd(InterfaceC2409Fc interfaceC2409Fc, HY hy) {
        super.requestHeadersEnd(interfaceC2409Fc, hy);
        try {
            Log.d("NetTrace-Listener", "requestHeadersEnd");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void requestHeadersStart(InterfaceC2409Fc interfaceC2409Fc) {
        super.requestHeadersStart(interfaceC2409Fc);
        try {
            Log.d("NetTrace-Listener", "requestHeadersStart");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersStart net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void responseBodyEnd(InterfaceC2409Fc interfaceC2409Fc, long j) {
        super.responseBodyEnd(interfaceC2409Fc, j);
        try {
            Log.d("NetTrace-Listener", "responseBodyEnd");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.r);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void responseBodyStart(InterfaceC2409Fc interfaceC2409Fc) {
        super.responseBodyStart(interfaceC2409Fc);
        try {
            Log.d("NetTrace-Listener", "responseBodyStart");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyStart net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.q);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void responseHeadersEnd(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) {
        super.responseHeadersEnd(interfaceC2409Fc, c5021xZ);
        try {
            Log.d("NetTrace-Listener", "responseHeadersEnd");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void responseHeadersStart(InterfaceC2409Fc interfaceC2409Fc) {
        super.responseHeadersStart(interfaceC2409Fc);
        try {
            Log.d("NetTrace-Listener", "responseHeadersStart");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersStart net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.o);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void secureConnectEnd(InterfaceC2409Fc interfaceC2409Fc, C3657hz c3657hz) {
        super.secureConnectEnd(interfaceC2409Fc, c3657hz);
        try {
            Log.d("NetTrace-Listener", "secureConnectEnd");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectEnd net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.h);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2865Wr
    public void secureConnectStart(InterfaceC2409Fc interfaceC2409Fc) {
        super.secureConnectStart(interfaceC2409Fc);
        try {
            Log.d("NetTrace-Listener", "secureConnectStart");
            if (!this.b && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectStart net enable false.");
                return;
            }
            a(interfaceC2409Fc, d.g);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(InterfaceC2409Fc interfaceC2409Fc) {
        String str;
        d dVarC;
        try {
            f fVarA = e.a(interfaceC2409Fc);
            if (fVarA == null || (dVarC = a.a().c((str = fVarA.f728a))) == null) {
                return;
            }
            Map<String, Long> map = dVarC.E;
            Map<String, Long> map2 = dVarC.F;
            map2.put(d.s, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f726a, d.b)));
            map2.put(d.t, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.d, d.e)));
            map2.put(d.u, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.g, d.h)));
            map2.put(d.v, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f, d.i)));
            map2.put(d.w, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.k, d.l)));
            map2.put(d.x, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.m, d.n)));
            map2.put(d.y, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.o, d.p)));
            map2.put(d.z, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.q, d.r)));
            a(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(String str) {
        try {
            final d dVarC = a.a().c(str);
            final c cVarA = a.a().a(str);
            if (dVarC == null || cVarA == null) {
                return;
            }
            Map<String, Long> map = dVarC.E;
            Map<String, Long> map2 = dVarC.F;
            Log.i("NetTrace-Listener", cVarA.toString());
            if (TextUtils.isEmpty(dVarC.B)) {
                Log.d("NetTrace-Listener", "url is null.");
                return;
            }
            final EfsJSONLog efsJSONLog = new EfsJSONLog("netperf");
            if (map.containsKey(d.d)) {
                efsJSONLog.put("wd_dns", map.get(d.d));
            }
            if (map.containsKey(d.e)) {
                efsJSONLog.put("wd_dnstm", map.get(d.e));
            }
            if (map2.containsKey(d.t)) {
                efsJSONLog.put("wl_dns", map2.get(d.t));
            }
            if (map.containsKey(d.f)) {
                efsJSONLog.put("wd_tcp", map.get(d.f));
            }
            if (map.containsKey(d.i)) {
                efsJSONLog.put("wd_tcptm", map.get(d.i));
            }
            if (map2.containsKey(d.v)) {
                efsJSONLog.put("wl_tcp", map2.get(d.v));
            }
            if (map.containsKey(d.g)) {
                efsJSONLog.put("wd_ssl", map.get(d.g));
            }
            if (map.containsKey(d.h)) {
                efsJSONLog.put("wd_ssltm", map.get(d.h));
            }
            if (map2.containsKey(d.u)) {
                efsJSONLog.put("wl_ssl", map2.get(d.u));
            }
            if (map.containsKey(d.k)) {
                efsJSONLog.put("wd_ds", map.get(d.k));
            }
            if (map.containsKey(d.n)) {
                efsJSONLog.put("wd_dstm", map.get(d.n));
            }
            if (map2.containsKey(d.w) && map2.containsKey(d.x)) {
                efsJSONLog.put("wl_ds", Long.valueOf(map2.get(d.w).longValue() + map2.get(d.x).longValue()));
            }
            if (map.containsKey(d.o)) {
                efsJSONLog.put("wd_srt", map.get(d.o));
            }
            if (map.containsKey(d.r)) {
                efsJSONLog.put("wd_srttm", map.get(d.r));
            }
            if (map2.containsKey(d.y) && map2.containsKey(d.z)) {
                efsJSONLog.put("wl_srt", Long.valueOf(map2.get(d.y).longValue() + map2.get(d.z).longValue()));
            }
            String[] strArrSplit = dVarC.B.split("\\?");
            String str2 = strArrSplit != null ? strArrSplit[0] : null;
            List list = this.c;
            if (list != null && str2 != null && !list.contains(str2)) {
                this.c.add(str2);
                if (map.containsKey(d.n)) {
                    efsJSONLog.put("wd_ttfb", map.get(d.n));
                } else if (map.containsKey(d.l)) {
                    efsJSONLog.put("wd_ttfb", map.get(d.l));
                }
                if (map.containsKey(d.o)) {
                    efsJSONLog.put("wd_ttfbtm", map.get(d.o));
                }
                if (map.containsKey(d.o)) {
                    if (map.containsKey(d.n)) {
                        efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.o).longValue() - map.get(d.n).longValue()));
                    } else if (map.containsKey(d.l)) {
                        efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.o).longValue() - map.get(d.l).longValue()));
                    }
                }
            } else {
                efsJSONLog.put("wd_ttfb", 0);
                efsJSONLog.put("wd_ttfbtm", 0);
                efsJSONLog.put("wl_ttfb", 0);
            }
            if (map.containsKey(d.f726a)) {
                efsJSONLog.put("wd_rt", map.get(d.f726a));
            }
            if (map.containsKey(d.b)) {
                efsJSONLog.put("wd_rttm", map.get(d.b));
            }
            if (map2.containsKey(d.s)) {
                efsJSONLog.put("wl_rt", map2.get(d.s));
            }
            efsJSONLog.put("wk_res", cVarA.c);
            efsJSONLog.put("wk_res_ori", dVarC.B);
            efsJSONLog.put("wk_ip", dVarC.C);
            efsJSONLog.put("wk_method", cVarA.e);
            efsJSONLog.put("wk_rc", Integer.valueOf(cVarA.i));
            efsJSONLog.put("wl_up", Long.valueOf(cVarA.g));
            efsJSONLog.put("wl_down", Long.valueOf(cVarA.m));
            efsJSONLog.put("wl_total", Long.valueOf(cVarA.g + cVarA.m));
            b.a(new Runnable() { // from class: com.efs.sdk.net.OkHttpListener.2
                @Override // java.lang.Runnable
                public final void run() {
                    Map<String, String> map3;
                    Map<String, String> map4;
                    try {
                        try {
                            String strA = com.efs.sdk.net.b.a.a((dVarC.E.containsKey(d.f726a) ? String.valueOf(dVarC.E.get(d.f726a)) : "") + ControllerCenter.getGlobalEnvStruct().getAppid() + ControllerCenter.getGlobalEnvStruct().getSecret());
                            if (NetManager.getNetConfigManager().getNetRequestBodyCollectState() && !TextUtils.isEmpty(cVarA.h)) {
                                efsJSONLog.put("wk_bd", com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(cVarA.h.getBytes(), strA.getBytes())));
                            }
                            if (NetManager.getNetConfigManager().getNetResponseBodyCollectState() && !TextUtils.isEmpty(cVarA.k)) {
                                efsJSONLog.put("wk_res_bd", com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(cVarA.k.getBytes(), strA.getBytes())));
                            }
                            if (NetManager.getNetConfigManager().getNetRequestHeaderCollectState() && (map4 = cVarA.f) != null && !map4.isEmpty()) {
                                efsJSONLog.put("wk_req_hd", com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(new JSONObject(cVarA.f).toString().getBytes(), strA.getBytes())));
                            }
                            if (NetManager.getNetConfigManager().getNetResponseHeaderCollectState() && (map3 = cVarA.l) != null && !map3.isEmpty()) {
                                efsJSONLog.put("wk_res_hd", com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(new JSONObject(cVarA.l).toString().getBytes(), strA.getBytes())));
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        OkHttpListener.a(dVarC, cVarA, efsJSONLog);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
            a.a().d(str);
            a.a().b(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(EfsJSONLog efsJSONLog) {
        try {
            EfsReporter reporter = NetManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                if (SamplingWhiteListUtil.isHitWL()) {
                    return;
                }
                SharedPreferences sharedPreferences = ControllerCenter.getGlobalEnvStruct().mAppContext.getSharedPreferences("net_launch" + ProcessUtil.getCurrentProcessName(), 0);
                String str = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(System.currentTimeMillis()));
                if (sharedPreferences != null) {
                    int i = sharedPreferences.getInt(str, 0);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (editorEdit != null) {
                        editorEdit.putInt(str, i + 1);
                        editorEdit.apply();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static String a(Map<String, String> map, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder();
            if (!SamplingWhiteListUtil.isHitWL()) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            sb.append("|");
            sb.append(NetManager.getNetConfigManager().getExtraRateFlag());
            if (map.size() != 0 && !z && z2) {
                sb.append("|1");
            } else {
                sb.append("|0");
            }
            sb.append("|");
            sb.append(new JSONObject(map).toString());
            return com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(sb.toString().getBytes(), ControllerCenter.getGlobalEnvStruct().getSecret().getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:86:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    public static /* synthetic */ void a(d dVar, c cVar, EfsJSONLog efsJSONLog) {
        boolean z;
        boolean zA;
        int extraDataRate;
        int iOptInt;
        try {
            SharedPreferences sharedPreferences = ControllerCenter.getGlobalEnvStruct().mAppContext.getSharedPreferences("net_launch" + ProcessUtil.getCurrentProcessName(), 0);
            String str = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(System.currentTimeMillis()));
            if (sharedPreferences != null) {
                int i = sharedPreferences.getInt(str, 0);
                if (!SamplingWhiteListUtil.isHitWL() && NetManager.getNetConfigManager().getDayLimit() != -1 && i >= NetManager.getNetConfigManager().getDayLimit()) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        Map<String, Object> strategyMap = NetManager.getReporter().getStrategyMap();
        boolean zA2 = com.efs.sdk.net.b.a.a(NetManager.getNetConfigManager().getDataRate());
        String strA = "";
        if (strategyMap == null || strategyMap.size() != 2) {
            z = false;
            zA = false;
        } else {
            try {
                zA = com.efs.sdk.net.b.a.a(((Integer) strategyMap.get("rate")).intValue());
                if (!zA2 && !zA) {
                    try {
                        if (!SamplingWhiteListUtil.isHitWL()) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        th.printStackTrace();
                        if (TextUtils.isEmpty(strA)) {
                            strA = a((Map<String, String>) new HashMap(), zA2, false);
                        }
                        efsJSONLog.put("dx", strA);
                        if (SamplingWhiteListUtil.isHitWL()) {
                            a(efsJSONLog);
                            return;
                        }
                        if (z) {
                            if (zA2) {
                            }
                            a(efsJSONLog);
                            return;
                        } else if (NetManager.getNetConfigManager().getExtraRateFlag() != 1) {
                            if (NetManager.getNetConfigManager().isStrategyHitCurrentProcess()) {
                                return;
                            } else {
                                return;
                            }
                        } else if (zA2) {
                            a(efsJSONLog);
                        }
                    }
                }
                JSONArray jSONArray = (JSONArray) strategyMap.get("stra");
                HashMap map = new HashMap();
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        if (!TextUtils.isEmpty(dVar.B)) {
                            String strOptString = jSONObjectOptJSONObject.optString(bc.aN);
                            if (!TextUtils.isEmpty(strOptString)) {
                                if (!strOptString.startsWith("^")) {
                                    Uri uri = Uri.parse(dVar.B);
                                    int port = uri.getPort();
                                    if (com.efs.sdk.net.b.a.a((port >= 0 && port <= 65535) ? uri.getHost() + ":" + port + uri.getPath() : uri.getHost() + uri.getPath()).equalsIgnoreCase(strOptString)) {
                                        iOptInt = jSONObjectOptJSONObject.optInt(bc.aK, -1);
                                        if (iOptInt == -1 && iOptInt <= 3) {
                                            int iOptInt2 = jSONObjectOptJSONObject.optInt(bc.aH, -1);
                                            if (iOptInt2 != 0) {
                                                if (iOptInt2 == 2 && NetManager.getNetConfigManager().getNetRequestBodyCollectState()) {
                                                    if (!TextUtils.isEmpty(cVar.h)) {
                                                    }
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(jSONObjectOptJSONObject.optInt(bc.aI));
                                            map.put(sb.toString(), "");
                                        }
                                    }
                                } else if (Pattern.matches(strOptString, dVar.B)) {
                                    iOptInt = jSONObjectOptJSONObject.optInt(bc.aK, -1);
                                    if (iOptInt == -1) {
                                    }
                                }
                            }
                        }
                    }
                }
                z = map.size() != 0;
                if (z) {
                    try {
                        NetManager.getNetConfigManager().setStrategyHitCurrentProcess(true);
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                    }
                }
                strA = a(map, zA2, zA);
            } catch (Throwable th3) {
                th = th3;
                z = false;
                zA = false;
            }
        }
        if (TextUtils.isEmpty(strA)) {
            strA = a((Map<String, String>) new HashMap(), zA2, false);
        }
        efsJSONLog.put("dx", strA);
        if (SamplingWhiteListUtil.isHitWL()) {
            a(efsJSONLog);
            return;
        }
        if (z) {
            if (!zA2 || zA) {
                a(efsJSONLog);
                return;
            }
            return;
        }
        if (NetManager.getNetConfigManager().getExtraRateFlag() != 1) {
            if (zA2) {
                a(efsJSONLog);
            }
        } else {
            if (NetManager.getNetConfigManager().isStrategyHitCurrentProcess() || (extraDataRate = NetManager.getNetConfigManager().getExtraDataRate()) == 0) {
                return;
            }
            if (extraDataRate != 100000 && new Random().nextInt(DefaultOggSeeker.MATCH_BYTE_RANGE) > extraDataRate) {
                return;
            }
            a(efsJSONLog);
        }
    }
}
