package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesFileSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferencesFileSerializer implements Serializer<Preferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreferencesFileSerializer f4730a = new PreferencesFileSerializer();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4731a;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f4731a = iArr;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new MutablePreferences(true);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            PreferencesProto.PreferenceMap preferenceMapV = PreferencesProto.PreferenceMap.v(inputStream);
            Preferences.Pair[] pairArr = new Preferences.Pair[0];
            MutablePreferences mutablePreferences = new MutablePreferences(false);
            Preferences.Pair[] pairs = (Preferences.Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            Intrinsics.f(pairs, "pairs");
            mutablePreferences.b();
            if (pairs.length > 0) {
                pairs[0].getClass();
                mutablePreferences.e(null, null);
                throw null;
            }
            Map mapT = preferenceMapV.t();
            Intrinsics.e(mapT, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapT.entrySet()) {
                String name = (String) entry.getKey();
                PreferencesProto.Value value = (PreferencesProto.Value) entry.getValue();
                Intrinsics.e(name, "name");
                Intrinsics.e(value, "value");
                PreferencesProto.Value.ValueCase valueCaseJ = value.J();
                switch (valueCaseJ == null ? -1 : WhenMappings.f4731a[valueCaseJ.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        mutablePreferences.e(new Preferences.Key(name), Boolean.valueOf(value.A()));
                        break;
                    case 2:
                        mutablePreferences.e(new Preferences.Key(name), Float.valueOf(value.E()));
                        break;
                    case 3:
                        mutablePreferences.e(new Preferences.Key(name), Double.valueOf(value.D()));
                        break;
                    case 4:
                        mutablePreferences.e(new Preferences.Key(name), Integer.valueOf(value.F()));
                        break;
                    case 5:
                        mutablePreferences.e(PreferencesKeys.a(name), Long.valueOf(value.G()));
                        break;
                    case 6:
                        Preferences.Key key = new Preferences.Key(name);
                        String strH = value.H();
                        Intrinsics.e(strH, "value.string");
                        mutablePreferences.e(key, strH);
                        break;
                    case 7:
                        Preferences.Key keyB = PreferencesKeys.b(name);
                        Internal.ProtobufList protobufListU = value.I().u();
                        Intrinsics.e(protobufListU, "value.stringSet.stringsList");
                        mutablePreferences.e(keyB, CollectionsKt.l0(protobufListU));
                        break;
                    case 8:
                        Preferences.Key key2 = new Preferences.Key(name);
                        byte[] bArrX = value.B().x();
                        Intrinsics.e(bArrX, "value.bytes.toByteArray()");
                        mutablePreferences.e(key2, bArrX);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new MutablePreferences(MapsKt.s(mutablePreferences.a()), true);
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Unable to parse preferences proto.", e2);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        GeneratedMessageLite generatedMessageLiteF;
        Map mapA = ((Preferences) obj).a();
        PreferencesProto.PreferenceMap.Builder builderU = PreferencesProto.PreferenceMap.u();
        for (Map.Entry entry : mapA.entrySet()) {
            Preferences.Key key = (Preferences.Key) entry.getKey();
            Object value = entry.getValue();
            String str = key.f4729a;
            if (value instanceof Boolean) {
                PreferencesProto.Value.Builder builderK = PreferencesProto.Value.K();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                builderK.i();
                PreferencesProto.Value.x((PreferencesProto.Value) builderK.f4850Y, zBooleanValue);
                generatedMessageLiteF = builderK.f();
            } else if (value instanceof Float) {
                PreferencesProto.Value.Builder builderK2 = PreferencesProto.Value.K();
                float fFloatValue = ((Number) value).floatValue();
                builderK2.i();
                PreferencesProto.Value.y((PreferencesProto.Value) builderK2.f4850Y, fFloatValue);
                generatedMessageLiteF = builderK2.f();
            } else if (value instanceof Double) {
                PreferencesProto.Value.Builder builderK3 = PreferencesProto.Value.K();
                double dDoubleValue = ((Number) value).doubleValue();
                builderK3.i();
                PreferencesProto.Value.v((PreferencesProto.Value) builderK3.f4850Y, dDoubleValue);
                generatedMessageLiteF = builderK3.f();
            } else if (value instanceof Integer) {
                PreferencesProto.Value.Builder builderK4 = PreferencesProto.Value.K();
                int iIntValue = ((Number) value).intValue();
                builderK4.i();
                PreferencesProto.Value.z((PreferencesProto.Value) builderK4.f4850Y, iIntValue);
                generatedMessageLiteF = builderK4.f();
            } else if (value instanceof Long) {
                PreferencesProto.Value.Builder builderK5 = PreferencesProto.Value.K();
                long jLongValue = ((Number) value).longValue();
                builderK5.i();
                PreferencesProto.Value.s((PreferencesProto.Value) builderK5.f4850Y, jLongValue);
                generatedMessageLiteF = builderK5.f();
            } else if (value instanceof String) {
                PreferencesProto.Value.Builder builderK6 = PreferencesProto.Value.K();
                builderK6.i();
                PreferencesProto.Value.t((PreferencesProto.Value) builderK6.f4850Y, (String) value);
                generatedMessageLiteF = builderK6.f();
            } else if (value instanceof Set) {
                PreferencesProto.Value.Builder builderK7 = PreferencesProto.Value.K();
                PreferencesProto.StringSet.Builder builderV = PreferencesProto.StringSet.v();
                Intrinsics.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                builderV.i();
                PreferencesProto.StringSet.s((PreferencesProto.StringSet) builderV.f4850Y, (Set) value);
                builderK7.i();
                PreferencesProto.Value.u((PreferencesProto.Value) builderK7.f4850Y, (PreferencesProto.StringSet) builderV.f());
                generatedMessageLiteF = builderK7.f();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                PreferencesProto.Value.Builder builderK8 = PreferencesProto.Value.K();
                byte[] bArr = (byte[]) value;
                ByteString byteString = ByteString.f4747Y;
                ByteString byteStringH = ByteString.h(0, bArr.length, bArr);
                builderK8.i();
                PreferencesProto.Value.w((PreferencesProto.Value) builderK8.f4850Y, byteStringH);
                generatedMessageLiteF = builderK8.f();
            }
            builderU.getClass();
            str.getClass();
            builderU.i();
            PreferencesProto.PreferenceMap.s((PreferencesProto.PreferenceMap) builderU.f4850Y).put(str, (PreferencesProto.Value) generatedMessageLiteF);
        }
        ((PreferencesProto.PreferenceMap) builderU.f()).g(outputStream);
        return Unit.f43263a;
    }
}
