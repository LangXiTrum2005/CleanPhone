package com.vungle.ads.internal.session;

import android.content.Context;
import androidx.webkit.internal.b;
import com.google.android.exoplayer2.video.a;
import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.d9;
import com.startapp.sdk.internal.C;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\u0002H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0082\b¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 H\u0002J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170 J\u0016\u0010#\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "", "context", "Landroid/content/Context;", JsonStorageKeyNames.SESSION_ID_KEY, "", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", d9.h.f24719b, "Ljava/io/File;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", d9.h.s, "", "unclosedAdList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "addUnclosedAd", "", "ad", "decodeJson", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "jsonString", "(Ljava/lang/String;)Ljava/lang/Object;", "readUnclosedAdFromFile", "", "removeUnclosedAd", "retrieveUnclosedAd", "writeUnclosedAdToFile", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UnclosedAdDetector {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final Executors executors;
    private File file;
    private final PathProvider pathProvider;
    private boolean ready;
    private final String sessionId;
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;
    private static final Json json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JsonBuilder) obj);
            return Unit.f43263a;
        }

        public final void invoke(JsonBuilder Json) {
            Intrinsics.f(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
            Json.setAllowStructuredMapKeys(true);
        }
    }, 1, null);

    public UnclosedAdDetector(Context context, String sessionId, Executors executors, PathProvider pathProvider) {
        Object objA;
        Intrinsics.f(context, "context");
        Intrinsics.f(sessionId, "sessionId");
        Intrinsics.f(executors, "executors");
        Intrinsics.f(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        boolean z2 = true;
        if (!this.file.exists()) {
            try {
                objA = Boolean.valueOf(this.file.createNewFile());
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Throwable thA = Result.a(objA);
            if (thA != null) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thA.getMessage());
            }
            z2 = true ^ (objA instanceof Result.Failure);
        }
        this.ready = z2;
    }

    private final <T> T decodeJson(String jsonString) {
        json.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? EmptyList.X : (List) new FutureResult(this.executors.getIO_EXECUTOR().submit(new b(this, 4))).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m3246readUnclosedAdFromFile$lambda4(UnclosedAdDetector this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            String string = FileUtility.INSTANCE.readString(this$0.file);
            if (string != null && string.length() != 0) {
                Json json2 = json;
                SerializersModule serializersModule = json2.getSerializersModule();
                KTypeProjection kTypeProjection = KTypeProjection.f43351c;
                KTypeProjection kTypeProjectionA = KTypeProjection.Companion.a(Reflection.b(UnclosedAd.class));
                ReflectionFactory reflectionFactory = Reflection.f43333a;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, reflectionFactory.m(reflectionFactory.b(List.class), Collections.singletonList(kTypeProjectionA), false));
                Intrinsics.d(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (List) json2.decodeFromString(kSerializerSerializer, string);
            }
            return new ArrayList();
        } catch (Exception e2) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e2.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m3247retrieveUnclosedAd$lambda3(UnclosedAdDetector this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            FileUtility.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e2) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to delete file " + e2.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> unclosedAdList) {
        if (this.ready) {
            try {
                Json json2 = json;
                SerializersModule serializersModule = json2.getSerializersModule();
                KTypeProjection kTypeProjection = KTypeProjection.f43351c;
                KTypeProjection kTypeProjectionA = KTypeProjection.Companion.a(Reflection.b(UnclosedAd.class));
                ReflectionFactory reflectionFactory = Reflection.f43333a;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, reflectionFactory.m(reflectionFactory.b(List.class), Collections.singletonList(kTypeProjectionA), false));
                Intrinsics.d(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.executors.getIO_EXECUTOR().execute(new a(26, this, json2.encodeToString(kSerializerSerializer, unclosedAdList)));
            } catch (Throwable th) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m3248writeUnclosedAdToFile$lambda5(UnclosedAdDetector this$0, String jsonContent) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(jsonContent, "$jsonContent");
        FileUtility.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(UnclosedAd ad) {
        Intrinsics.f(ad, "ad");
        if (this.ready) {
            ad.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Executors getExecutors() {
        return this.executors;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(UnclosedAd ad) {
        Intrinsics.f(ad, "ad");
        if (this.ready && this.unclosedAdList.contains(ad)) {
            this.unclosedAdList.remove(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIO_EXECUTOR().execute(new C(this, 16));
        return arrayList;
    }
}
