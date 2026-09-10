package com.google.firebase.sessions;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/SessionDataSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/firebase/sessions/SessionData;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionDataSerializer implements Serializer<SessionData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionGenerator f21096a;

    public SessionDataSerializer(SessionGenerator sessionGenerator) {
        Intrinsics.f(sessionGenerator, "sessionGenerator");
        this.f21096a = sessionGenerator;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new SessionData(this.f21096a.a(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            Json.Companion companion = Json.INSTANCE;
            String str = new String(ByteStreamsKt.b(inputStream), Charsets.f44691a);
            companion.getSerializersModule();
            return (SessionData) companion.decodeFromString(SessionData.INSTANCE.serializer(), str);
        } catch (Exception e2) {
            throw new CorruptionException("Cannot parse session data", e2);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        String strEncodeToString = Json.INSTANCE.encodeToString(SessionData.INSTANCE.serializer(), (SessionData) obj);
        Intrinsics.f(strEncodeToString, "<this>");
        byte[] bytes = strEncodeToString.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return Unit.f43263a;
    }
}
