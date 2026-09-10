package com.mbridge.msdk.newreward.function.proxy;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.function.command.retention.ReportAnnotation;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Handler f1718a;
    private WeakReference<Object> b;
    private com.mbridge.msdk.newreward.adapter.e c;
    private com.mbridge.msdk.newreward.function.command.c d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f1719a;
        final /* synthetic */ Method b;
        final /* synthetic */ Object[] c;

        public a(Object obj, Method method, Object[] objArr) {
            this.f1719a = obj;
            this.b = method;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.b(this.f1719a, this.b, this.c);
            } catch (NoSuchMethodException e) {
                o0.b("HandlerReportMessage", e.getMessage());
            }
        }
    }

    public b(Object obj, com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.command.c cVar) {
        HandlerThread handlerThread;
        this.b = new WeakReference<>(obj);
        this.c = eVar;
        this.d = cVar;
        if (eVar == null) {
            handlerThread = new HandlerThread("HandlerReportMessage");
            handlerThread.start();
        } else if (eVar.P() == null) {
            handlerThread = new HandlerThread("HandlerReportMessage");
            eVar.a(handlerThread);
            handlerThread.start();
        } else {
            handlerThread = eVar.P();
        }
        this.f1718a = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void b(Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        ReportAnnotation.MethodInfo methodInfo;
        if (this.d != null && method.isAnnotationPresent(ReportAnnotation.MethodInfo.class)) {
            if (((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) || (methodInfo = (ReportAnnotation.MethodInfo) method.getAnnotation(ReportAnnotation.MethodInfo.class)) == null) {
                return;
            }
            String strKey = methodInfo.key();
            String strReportType = methodInfo.reportType();
            strReportType.getClass();
            byte b = -1;
            switch (strReportType.hashCode()) {
                case 49:
                    if (strReportType.equals("1")) {
                        b = 0;
                    }
                    break;
                case 50:
                    if (strReportType.equals("2")) {
                        b = 1;
                    }
                    break;
                case 51:
                    if (strReportType.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        b = 2;
                    }
                    break;
            }
            Map<String, String> mapA = null;
            switch (b) {
                case 0:
                    boolean zIsParameter = methodInfo.isParameter();
                    if (zIsParameter && this.b.get() != null) {
                        mapA = a(this.b.get(), method.getName(), objArr);
                    }
                    o0.b("HandlerReportMessage", "开始上报，方法名：" + method.getName() + ", isParameter-->" + zIsParameter + ",BuildType-->1");
                    com.mbridge.msdk.newreward.function.command.c cVar = this.d;
                    cVar.a(cVar.a("adapter_model", this.c, "metrics_data", mapA, "metrics_report_key", strKey), "ReportReceiver");
                    break;
                case 1:
                    try {
                        String strClassName = methodInfo.className();
                        String strMethodName = methodInfo.methodName();
                        d[] dVarArrA = this.c.p().a();
                        if (!TextUtils.isEmpty(strClassName) && !TextUtils.isEmpty(strMethodName) && dVarArrA != null && dVarArrA.length != 0) {
                            for (d dVar : dVarArrA) {
                                if (dVar.a().equals(strClassName) && dVar.c().equals(strMethodName)) {
                                    String strB = dVar.b();
                                    if (TextUtils.isEmpty(strB)) {
                                        continue;
                                    } else {
                                        com.mbridge.msdk.newreward.function.command.c cVar2 = this.d;
                                        cVar2.a(cVar2.a("adapter_model", this.c, "metrics_report_key", strB), "ReportReceiver");
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        o0.b("HandlerReportMessage", e.getMessage());
                        return;
                    }
                    break;
                case 2:
                    o0.b("HandlerReportMessage", "开始上报，方法名：" + method.getName() + ",BuildType-->3");
                    String str = (String) objArr[0];
                    if (str.equals("onCreate")) {
                        str = "2000129";
                    }
                    if (str.equals("onDestroy")) {
                        str = "2000151";
                    }
                    try {
                        if (methodInfo.isParameter() && this.b.get() != null && objArr.length > 1) {
                            Object obj2 = objArr[1];
                            if (obj2 instanceof com.mbridge.msdk.foundation.same.report.metrics.e) {
                                mapA = ((com.mbridge.msdk.foundation.same.report.metrics.e) obj2).a();
                            }
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                    com.mbridge.msdk.newreward.function.command.c cVar3 = this.d;
                    cVar3.a(cVar3.a("adapter_model", this.c, "metrics_data", mapA, "metrics_report_key", str), "ReportReceiver");
                    break;
            }
        }
    }

    public void c(Object obj, Method method, Object[] objArr) {
        Handler handler = this.f1718a;
        if (handler == null) {
            return;
        }
        handler.post(new a(obj, method, objArr));
        a(obj, method, objArr);
    }

    private void a(Object obj, Method method, Object[] objArr) {
        CampaignEx campaignEx;
        try {
            com.mbridge.msdk.newreward.adapter.e eVar = this.c;
            if (eVar != null && eVar.g() != null && this.c.g().b() != null && !this.c.g().b().isEmpty()) {
                List<CampaignEx> listB = this.c.g().b();
                if (listB.isEmpty() || (campaignEx = listB.get(0)) == null || !campaignEx.isActiveOm()) {
                    return;
                }
                com.mbridge.msdk.newreward.function.command.c cVar = this.d;
                Object[] objArr2 = new Object[10];
                objArr2[0] = "adapter_model";
                objArr2[1] = this.c;
                objArr2[2] = "methodName";
                objArr2[3] = method;
                objArr2[4] = "methodRep";
                objArr2[5] = obj;
                objArr2[6] = "args";
                objArr2[7] = objArr;
                objArr2[8] = "target";
                WeakReference<Object> weakReference = this.b;
                objArr2[9] = weakReference == null ? null : weakReference.get();
                cVar.a(cVar.a(objArr2), "OMSDKReceiver");
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private Map a(Object obj, String str, Object[] objArr) {
        HashMap map = new HashMap();
        try {
            int length = objArr.length;
            Class<?>[] clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                Object obj2 = objArr[i];
                if (obj2 instanceof Integer) {
                    clsArr[i] = Integer.TYPE;
                } else {
                    clsArr[i] = obj2.getClass();
                }
            }
            Method method = obj.getClass().getMethod(str, clsArr);
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            for (int i2 = 0; i2 < parameterAnnotations.length; i2++) {
                int i3 = 0;
                while (true) {
                    Annotation[] annotationArr = parameterAnnotations[i2];
                    if (i3 < annotationArr.length) {
                        Annotation annotation = annotationArr[i3];
                        if (annotation instanceof BridgeParameter) {
                            String strKey = ((BridgeParameter) annotation).key();
                            Object obj3 = objArr[i2];
                            StringBuilder sb = new StringBuilder();
                            sb.append("ioc上报参数为：第");
                            int i4 = i2 + 1;
                            sb.append(i4);
                            sb.append("参数，第");
                            int i5 = i3 + 1;
                            sb.append(i5);
                            sb.append("个注解,Annotation.parametersKey=");
                            sb.append(strKey);
                            sb.append(", methodName->");
                            sb.append(method.getName());
                            o0.b("HandlerReportMessage", sb.toString());
                            o0.b("HandlerReportMessage", "ioc上报参数为：第" + i4 + "参数，第" + i5 + "个注解,Parameter.value=" + obj3);
                            map.put(strKey, obj3);
                        }
                        i3++;
                    }
                }
            }
            return map;
        } catch (Exception e) {
            o0.b("HandlerReportMessage", e.getMessage());
            return map;
        }
    }
}
