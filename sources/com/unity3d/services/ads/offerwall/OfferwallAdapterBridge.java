package com.unity3d.services.ads.offerwall;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.core.log.DeviceLog;
import fn.g;
import fn.m0;
import fn.r0;
import fn.u0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R4\u0010'\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "", "Lcn/a0;", "scope", "<init>", "(Lcn/a0;)V", "Ljava/lang/reflect/InvocationHandler;", "tapjoyPlacementListener", "()Ljava/lang/reflect/InvocationHandler;", "placementObj", "", "getPlacementName", "(Ljava/lang/Object;)Ljava/lang/String;", "placementName", "getPlacement", "(Ljava/lang/String;)Ljava/lang/Object;", "getVersion", "()Ljava/lang/String;", "", "isConnected", "()Z", "isAdReady", "(Ljava/lang/String;)Z", "Lwj/r;", "loadAd", "(Ljava/lang/String;)V", "showAd", "Lcn/a0;", "Lfn/m0;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "_offerwallEventFlow", "Lfn/m0;", "Lfn/r0;", "offerwallEventFlow", "Lfn/r0;", "getOfferwallEventFlow", "()Lfn/r0;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "placementsMap", "Ljava/util/HashMap;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OfferwallAdapterBridge {
    private final m0 _offerwallEventFlow;
    private final r0 offerwallEventFlow;
    private final HashMap<String, Object> placementsMap;
    private final a0 scope;

    /* JADX INFO: renamed from: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1", f = "OfferwallAdapterBridge.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, f fVar) {
            super(2, fVar);
            this.$placementName = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return OfferwallAdapterBridge.this.new AnonymousClass1(this.$placementName, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                m0 m0Var = OfferwallAdapterBridge.this._offerwallEventFlow;
                OfferwallEventData offerwallEventData = new OfferwallEventData(OfferwallEvent.SHOW_FAILED, this.$placementName, null, null, 12, null);
                this.label = 1;
                Object objEmit = m0Var.emit(offerwallEventData, this);
                bk.a aVar = bk.a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    public OfferwallAdapterBridge(a0 scope) {
        n.f(scope, "scope");
        this.scope = scope;
        u0 u0VarA = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, en.a.f40122a);
        this._offerwallEventFlow = u0VarA;
        this.offerwallEventFlow = g.g(u0VarA);
        this.placementsMap = new HashMap<>();
    }

    private final Object getPlacement(String placementName) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, placementName, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }

    private final String getPlacementName(Object placementObj) {
        return (String) placementObj.getClass().getDeclaredMethod("getName", null).invoke(placementObj, null);
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new InvocationHandler() { // from class: com.unity3d.services.ads.offerwall.a
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0(this.f38588a, obj, method, objArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge this$0, Object obj, Method method, Object[] objArr) {
        n.f(this$0, "this$0");
        String name = method.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        n.e(obj2, "args[0]");
                        String placementName = this$0.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        d0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(this$0, placementName, null), 3);
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        n.e(obj3, "args[0]");
                        String placementName2 = this$0.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        d0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this$0, placementName2, null), 3);
                        return null;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        n.e(obj4, "args[0]");
                        String placementName3 = this$0.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        d0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(this$0, placementName3, null), 3);
                        return null;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object placementObj = objArr[0];
                        n.e(placementObj, "placementObj");
                        String placementName4 = this$0.getPlacementName(placementObj);
                        Boolean bool = (Boolean) placementObj.getClass().getDeclaredMethod("isContentAvailable", null).invoke(placementObj, null);
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + zBooleanValue);
                        d0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(zBooleanValue, this$0, placementName4, null), 3);
                        return null;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj5 = objArr[0];
                        n.e(obj5, "args[0]");
                        String placementName5 = this$0.getPlacementName(obj5);
                        this$0.placementsMap.remove(placementName5 == null ? "" : placementName5);
                        Object obj6 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj6.getClass().getField("code").get(obj6)) + ", errorMessage: " + ((String) obj6.getClass().getField("message").get(obj6)));
                        d0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(this$0, placementName5, null), 3);
                        return null;
                    }
                    break;
            }
        }
        return null;
    }

    public final r0 getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getVersion", null).invoke(null, null);
            return str == null ? "0.0.0" : str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isAdReady(String placementName) {
        n.f(placementName, "placementName");
        Object placement = getPlacement(placementName);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("isContentReady", null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(placement, null) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isConnected() {
        try {
            Boolean bool = (Boolean) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", null).invoke(null, null);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void loadAd(String placementName) throws IllegalAccessException, InvocationTargetException {
        n.f(placementName, "placementName");
        Object placement = getPlacement(placementName);
        this.placementsMap.put(placementName, placement);
        Method declaredMethod = placement != null ? placement.getClass().getDeclaredMethod("requestContent", null) : null;
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, null);
        }
    }

    public final void showAd(String placementName) throws IllegalAccessException, InvocationTargetException {
        n.f(placementName, "placementName");
        Object obj = this.placementsMap.get(placementName);
        Method declaredMethod = obj != null ? obj.getClass().getDeclaredMethod("isContentAvailable", null) : null;
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, null) : null);
        if (bool != null ? bool.booleanValue() : false) {
            Method declaredMethod2 = obj != null ? obj.getClass().getDeclaredMethod("showContent", null) : null;
            if (declaredMethod2 != null) {
                declaredMethod2.invoke(obj, null);
            }
        } else {
            d0.w(this.scope, null, new AnonymousClass1(placementName, null), 3);
        }
        this.placementsMap.remove(placementName);
    }
}
