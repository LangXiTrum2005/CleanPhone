package com.inmobi.unifiedId;

import A.RunnableC0883c;
import A.RunnableC0895i;
import android.content.Context;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC2936ab;
import com.inmobi.media.AbstractC3174p5;
import com.inmobi.media.AbstractC3310xe;
import com.inmobi.media.AbstractC3342ze;
import com.inmobi.media.B6;
import com.inmobi.media.C3246te;
import com.inmobi.media.C6;
import com.inmobi.media.L4;
import com.inmobi.media.O2;
import com.inmobi.media.Pd;
import com.inmobi.media.Q5;
import com.inmobi.media.Td;
import com.inmobi.media.Uc;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "", "push", "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "fetchUnifiedIdsInternal", "reset", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMobiUnifiedIdService {
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f24171a = new AtomicBoolean();

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[Catch: JSONException -> 0x0084, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0084, blocks: (B:39:0x0070, B:41:0x0076), top: B:61:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        boolean z2;
        JSONArray jSONArray;
        boolean z3;
        JSONObject jSONObjectB = Q5.b();
        if (jSONObjectB != null) {
            try {
                JSONArray jSONArray2 = jSONObjectB.has("ufids") ? jSONObjectB.getJSONArray("ufids") : null;
                if (jSONArray2 != null && jSONArray2.length() != 0) {
                    try {
                        if (jSONObjectB.has("ufids")) {
                            JSONArray jSONArray3 = jSONObjectB.getJSONArray("ufids");
                            int length = jSONArray3.length();
                            z2 = true;
                            for (int i2 = 0; i2 < length; i2++) {
                                try {
                                    z2 &= System.currentTimeMillis() <= jSONArray3.getJSONObject(i2).getLong("expiry");
                                } catch (JSONException unused) {
                                    Objects.toString(jSONObjectB);
                                    if (!z2) {
                                        JSONObject jSONObject = AbstractC3310xe.f24108a;
                                        if (inMobiUnifiedIdInterface != null) {
                                            AbstractC3310xe.f24109b.add(inMobiUnifiedIdInterface);
                                        }
                                        if (AbstractC3310xe.b()) {
                                            Objects.toString(inMobiUnifiedIdInterface);
                                            return;
                                        } else {
                                            AbstractC3310xe.d();
                                            return;
                                        }
                                    }
                                    if (inMobiUnifiedIdInterface != null) {
                                        if (jSONObjectB == null) {
                                            try {
                                                if (jSONObjectB.has("ufids")) {
                                                    jSONArray = jSONObjectB.getJSONArray("ufids");
                                                } else {
                                                    jSONArray = null;
                                                }
                                                if (jSONArray != null) {
                                                }
                                            } catch (JSONException unused2) {
                                            }
                                        }
                                        if (z3) {
                                            AbstractC3342ze.a(inMobiUnifiedIdInterface, jSONObjectB, null);
                                            return;
                                        }
                                        if (f24171a.get()) {
                                            AbstractC3342ze.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
                                            return;
                                        }
                                        AbstractC3310xe.f24109b.add(inMobiUnifiedIdInterface);
                                        if (AbstractC3310xe.b()) {
                                            Objects.toString(inMobiUnifiedIdInterface);
                                        } else {
                                            AbstractC3310xe.d();
                                        }
                                    }
                                }
                            }
                        } else {
                            z2 = true;
                        }
                    } catch (JSONException unused3) {
                        z2 = true;
                    }
                    if (!z2) {
                        JSONObject jSONObject2 = AbstractC3310xe.f24108a;
                        if (inMobiUnifiedIdInterface != null) {
                            AbstractC3310xe.f24109b.add(inMobiUnifiedIdInterface);
                        }
                        if (AbstractC3310xe.b()) {
                            Objects.toString(inMobiUnifiedIdInterface);
                            return;
                        } else {
                            AbstractC3310xe.d();
                            return;
                        }
                    }
                }
            } catch (JSONException unused4) {
            }
        }
        if (inMobiUnifiedIdInterface != null) {
            if (jSONObjectB == null) {
                if (jSONObjectB.has("ufids")) {
                    jSONArray = jSONObjectB.getJSONArray("ufids");
                } else {
                    jSONArray = null;
                }
                z3 = jSONArray != null || jSONArray.length() == 0;
            }
            if (z3) {
                AbstractC3342ze.a(inMobiUnifiedIdInterface, jSONObjectB, null);
                return;
            }
            if (f24171a.get()) {
                AbstractC3342ze.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
                return;
            }
            AbstractC3310xe.f24109b.add(inMobiUnifiedIdInterface);
            if (AbstractC3310xe.b()) {
                Objects.toString(inMobiUnifiedIdInterface);
            } else {
                AbstractC3310xe.d();
            }
        }
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface);
    }

    @JvmStatic
    public static final void fetchUnifiedIds(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (!Uc.q()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        Uc.a(new RunnableC0883c(inMobiUnifiedIdInterface, 25));
    }

    @JvmStatic
    public static final void fetchUnifiedIdsInternal$media_release(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        boolean zBooleanValue;
        HashMap map = new HashMap();
        Pd pd = Pd.f23077a;
        Pd.b("FetchApiInvoked", map, Td.SDK);
        LinkedHashMap linkedHashMap = O2.f23027a;
        boolean enabled = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            reset();
        }
        if (!enabled) {
            AbstractC3342ze.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
            return;
        }
        Boolean boolC = C3246te.f24014a.c();
        boolean zBooleanValue2 = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue2) {
            reset();
        }
        if (zBooleanValue2) {
            AbstractC3342ze.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
            return;
        }
        Boolean bool = AbstractC2936ab.f23444b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context contextD = Uc.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                AbstractC2936ab.f23444b = Boolean.valueOf(B6.a(contextD, "user_info_store").f22735a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC2936ab.f23444b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            AbstractC3342ze.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
            return;
        }
        synchronized (AbstractC3310xe.class) {
            try {
                if (AbstractC3310xe.b()) {
                    if (inMobiUnifiedIdInterface != null) {
                        AbstractC3310xe.f24109b.add(inMobiUnifiedIdInterface);
                    }
                    if (AbstractC3310xe.b()) {
                        Objects.toString(inMobiUnifiedIdInterface);
                    } else {
                        AbstractC3310xe.d();
                    }
                } else {
                    a(inMobiUnifiedIdInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void isPushCalled$annotations() {
    }

    @JvmStatic
    public static final void push(InMobiUserDataModel inMobiUserDataModel) {
        Objects.toString(inMobiUserDataModel);
        if (!Uc.q()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        Uc.a(new RunnableC0883c(inMobiUserDataModel, 24));
    }

    @JvmStatic
    public static final void reset() {
        if (!Uc.q()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        Uc.a(new RunnableC0895i(14));
    }

    public final AtomicBoolean isPushCalled() {
        return f24171a;
    }

    public static final void a(InMobiUserDataModel inMobiUserDataModel) {
        boolean zBooleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        Objects.toString(inMobiUserDataModel);
        LinkedHashMap linkedHashMap = O2.f23027a;
        boolean enabled = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            reset();
        }
        if (enabled) {
            Boolean boolC = C3246te.f24014a.c();
            boolean zBooleanValue2 = boolC != null ? boolC.booleanValue() : true;
            if (zBooleanValue2) {
                reset();
            }
            if (zBooleanValue2) {
                return;
            }
            Boolean bool = AbstractC2936ab.f23444b;
            boolean zEquals = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                Context contextD = Uc.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = C6.f22734b;
                    AbstractC2936ab.f23444b = Boolean.valueOf(B6.a(contextD, "user_info_store").f22735a.getBoolean("user_age_restricted", false));
                }
                Boolean bool2 = AbstractC2936ab.f23444b;
                zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            }
            if (zBooleanValue) {
                return;
            }
            if (inMobiUserDataModel == null && L4.f22944a == null) {
                zEquals = true;
            } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = L4.f22944a) != null) {
                zEquals = inMobiUserDataModel.equals(inMobiUserDataModel2);
            }
            if (zEquals && f24171a.get()) {
                return;
            }
            synchronized (L4.class) {
                Objects.toString(L4.f22944a);
                Objects.toString(inMobiUserDataModel);
                L4.f22944a = inMobiUserDataModel;
            }
            f24171a.set(true);
            AbstractC3310xe.c();
        }
    }

    public static final void a() {
        f24171a.set(false);
        synchronized (L4.class) {
            Objects.toString(L4.f22944a);
            L4.f22944a = null;
        }
        AbstractC3310xe.e();
        Q5.b(null);
        Q5.a(null);
        Q5.d = false;
        Q5.f23105c = false;
    }
}
