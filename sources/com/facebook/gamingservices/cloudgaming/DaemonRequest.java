package com.facebook.gamingservices.cloudgaming;

import com.facebook.GraphResponse;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public class DaemonRequest {

    /* JADX INFO: renamed from: com.facebook.gamingservices.cloudgaming.DaemonRequest$1, reason: invalid class name */
    class AnonymousClass1 implements Consumer<GraphResponse> {
        @Override // java.util.function.Consumer
        public final void accept(GraphResponse graphResponse) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.cloudgaming.DaemonRequest$2, reason: invalid class name */
    class AnonymousClass2 implements Supplier<GraphResponse> {
        @Override // java.util.function.Supplier
        public final GraphResponse get() {
            UUID.randomUUID().toString();
            throw null;
        }
    }

    public interface Callback {
        void a();
    }
}
