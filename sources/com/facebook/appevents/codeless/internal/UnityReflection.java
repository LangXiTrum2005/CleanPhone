package com.facebook.appevents.codeless.internal;

import android.util.Log;
import com.ironsource.C0335f8;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/codeless/internal/UnityReflection;", "", "<init>", "()V", "Ljava/lang/Class;", "getUnityPlayerClass", "()Ljava/lang/Class;", "", "unityObject", "unityMethod", "message", "Lwj/r;", C0335f8.f28652j, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "captureViewHierarchy", "eventMapping", "sendEventMapping", "(Ljava/lang/String;)V", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "UNITY_PLAYER_CLASS", "UNITY_SEND_MESSAGE_METHOD", "FB_UNITY_GAME_OBJECT", "CAPTURE_VIEW_HIERARCHY_METHOD", "EVENT_MAPPING_METHOD", "unityPlayer", "Ljava/lang/Class;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UnityReflection {
    private static final String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";
    private static final String EVENT_MAPPING_METHOD = "OnReceiveMapping";
    private static final String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";
    public static final UnityReflection INSTANCE = new UnityReflection();
    private static final String TAG = UnityReflection.class.getCanonicalName();
    private static final String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";
    private static final String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";
    private static Class<?> unityPlayer;

    private UnityReflection() {
    }

    public static final void captureViewHierarchy() {
        sendMessage(FB_UNITY_GAME_OBJECT, CAPTURE_VIEW_HIERARCHY_METHOD, "");
    }

    private final Class<?> getUnityPlayerClass() {
        return Class.forName("com.unity3d.player.UnityPlayer");
    }

    public static final void sendEventMapping(String eventMapping) {
        sendMessage(FB_UNITY_GAME_OBJECT, EVENT_MAPPING_METHOD, eventMapping);
    }

    public static final void sendMessage(String unityObject, String unityMethod, String message) {
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.getUnityPlayerClass();
            }
            Class<?> cls = unityPlayer;
            if (cls == null) {
                n.l("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod(UNITY_SEND_MESSAGE_METHOD, String.class, String.class, String.class);
            Class<?> cls2 = unityPlayer;
            if (cls2 != null) {
                method.invoke(cls2, unityObject, unityMethod, message);
            } else {
                n.l("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(TAG, "Failed to send message to Unity", e10);
        }
    }
}
