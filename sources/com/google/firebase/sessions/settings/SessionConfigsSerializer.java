package com.google.firebase.sessions.settings;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigsSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionConfigsSerializer implements Serializer<SessionConfigs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SessionConfigsSerializer f21168a = new SessionConfigsSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SessionConfigs f21169b = new SessionConfigs(null, null, null, null, null);

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return f21169b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            Json.Companion companion = Json.INSTANCE;
            String str = new String(ByteStreamsKt.b(inputStream), Charsets.f44691a);
            companion.getSerializersModule();
            return (SessionConfigs) companion.decodeFromString(SessionConfigs.INSTANCE.serializer(), str);
        } catch (Exception e2) {
            throw new CorruptionException("Cannot parse session configs", e2);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        String strEncodeToString = Json.INSTANCE.encodeToString(SessionConfigs.INSTANCE.serializer(), (SessionConfigs) obj);
        Intrinsics.f(strEncodeToString, "<this>");
        byte[] bytes = strEncodeToString.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return Unit.f43263a;
    }
}
