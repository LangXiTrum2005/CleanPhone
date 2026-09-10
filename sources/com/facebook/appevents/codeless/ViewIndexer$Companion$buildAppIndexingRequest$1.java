package com.facebook.appevents.codeless;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class ViewIndexer$Companion$buildAppIndexingRequest$1 implements GraphRequest.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewIndexer$Companion$buildAppIndexingRequest$1 f16067a = new ViewIndexer$Companion$buildAppIndexingRequest$1();

    @Override // com.facebook.GraphRequest.Callback
    public final void a(GraphResponse graphResponse) {
        HashMap map = Logger.d;
        Logger.Companion.a(LoggingBehavior.f0, ViewIndexer.a(), "App index sent to FB!");
    }
}
