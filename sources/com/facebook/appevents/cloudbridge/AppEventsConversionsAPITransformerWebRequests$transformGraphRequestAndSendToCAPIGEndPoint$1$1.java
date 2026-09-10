package com.facebook.appevents.cloudbridge;

import java.util.List;
import java.util.Map;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import l7.s;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "", "responseCode", "Lwj/r;", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 extends o implements c {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Integer num, List processedEvents) {
        n.f(processedEvents, "$processedEvents");
        if (xj.n.i0(AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE, num)) {
            return;
        }
        AppEventsConversionsAPITransformerWebRequests.INSTANCE.handleError$facebook_core_release(num, processedEvents, 5);
    }

    @Override // jk.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Integer) obj2);
        return r.f53297a;
    }

    public final void invoke(String str, final Integer num) {
        final List<Map<String, Object>> list = this.$processedEvents;
        try {
            s.d().execute(new Runnable() { // from class: com.facebook.appevents.cloudbridge.b
                @Override // java.lang.Runnable
                public final void run() {
                    AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1.invoke$lambda$0(num, list);
                }
            });
        } catch (Exception unused) {
        }
    }
}
