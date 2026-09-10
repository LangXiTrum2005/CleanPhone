package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/tt;", "", "Lcom/ironsource/jf;", "applicationLifecycleService", "", "a", "Lcom/ironsource/ad;", "Lcom/ironsource/ad;", "calculator", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tt {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ad calculator;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ironsource/tt$a;", "Lcom/ironsource/st;", "", "run", "<init>", "(Lcom/ironsource/tt;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public final class a extends st {
        public a() {
        }

        @Override // com.p004ironsource.st, java.lang.Runnable
        public void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put("duration", getTimeInForeground());
            } catch (JSONException e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            kq.f25536P.a(new zb(ac.APP_ENTER_BACKGROUND, mediationAdditionalData));
        }
    }

    public final void a(jf applicationLifecycleService) {
        Intrinsics.f(applicationLifecycleService, "applicationLifecycleService");
        this.calculator = new ad(applicationLifecycleService, new a());
    }
}
