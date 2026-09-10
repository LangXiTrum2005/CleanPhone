package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto {

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4718a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4718a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4718a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4718a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4718a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4718a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4718a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4718a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.f4880Y;

        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        }

        public static final class PreferencesDefaultEntryHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MapEntryLite f4719a = new MapEntryLite(WireFormat.FieldType.l0, WireFormat.FieldType.n0, Value.C());
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.r(PreferenceMap.class, preferenceMap);
        }

        public static MapFieldLite s(PreferenceMap preferenceMap) {
            MapFieldLite<String, Value> mapFieldLite = preferenceMap.preferences_;
            if (!mapFieldLite.X) {
                preferenceMap.preferences_ = mapFieldLite.i();
            }
            return preferenceMap.preferences_;
        }

        public static Builder u() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.f0, null));
        }

        public static PreferenceMap v(InputStream inputStream) throws InvalidProtocolBufferException {
            GeneratedMessageLite generatedMessageLiteQ = GeneratedMessageLite.q(DEFAULT_INSTANCE, CodedInputStream.f(inputStream), ExtensionRegistryLite.a());
            if (GeneratedMessageLite.l(generatedMessageLiteQ, true)) {
                return (PreferenceMap) generatedMessageLiteQ;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.o(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.f4719a});
                case 3:
                    return new PreferenceMap();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<PreferenceMap> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PreferenceMap.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final Map t() {
            return Collections.unmodifiableMap(this.preferences_);
        }
    }

    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.i();

        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.r(StringSet.class, stringSet);
        }

        public static void s(StringSet stringSet, Set set) {
            Internal.ProtobufList<String> protobufList = stringSet.strings_;
            if (!protobufList.isModifiable()) {
                int size = protobufList.size();
                stringSet.strings_ = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            }
            AbstractMessageLite.a(set, stringSet.strings_);
        }

        public static StringSet t() {
            return DEFAULT_INSTANCE;
        }

        public static Builder v() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.f0, null));
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.o(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 3:
                    return new StringSet();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<StringSet> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StringSet.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final Internal.ProtobufList u() {
            return this.strings_;
        }
    }

    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private Object value_;

        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ValueCase {
            public static final ValueCase X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final ValueCase f4720Y;
            public static final ValueCase Z;
            public static final ValueCase e0;
            public static final ValueCase f0;
            public static final ValueCase g0;
            public static final ValueCase h0;
            public static final ValueCase i0;
            public static final ValueCase j0;
            public static final /* synthetic */ ValueCase[] k0;

            static {
                ValueCase valueCase = new ValueCase("BOOLEAN", 0);
                X = valueCase;
                ValueCase valueCase2 = new ValueCase("FLOAT", 1);
                f4720Y = valueCase2;
                ValueCase valueCase3 = new ValueCase("INTEGER", 2);
                Z = valueCase3;
                ValueCase valueCase4 = new ValueCase("LONG", 3);
                e0 = valueCase4;
                ValueCase valueCase5 = new ValueCase("STRING", 4);
                f0 = valueCase5;
                ValueCase valueCase6 = new ValueCase("STRING_SET", 5);
                g0 = valueCase6;
                ValueCase valueCase7 = new ValueCase("DOUBLE", 6);
                h0 = valueCase7;
                ValueCase valueCase8 = new ValueCase("BYTES", 7);
                i0 = valueCase8;
                ValueCase valueCase9 = new ValueCase("VALUE_NOT_SET", 8);
                j0 = valueCase9;
                k0 = new ValueCase[]{valueCase, valueCase2, valueCase3, valueCase4, valueCase5, valueCase6, valueCase7, valueCase8, valueCase9};
            }

            public static ValueCase valueOf(String str) {
                return (ValueCase) Enum.valueOf(ValueCase.class, str);
            }

            public static ValueCase[] values() {
                return (ValueCase[]) k0.clone();
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.r(Value.class, value);
        }

        public static Value C() {
            return DEFAULT_INSTANCE;
        }

        public static Builder K() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.f0, null));
        }

        public static void s(Value value, long j) {
            value.valueCase_ = 4;
            value.value_ = Long.valueOf(j);
        }

        public static void t(Value value, String str) {
            value.getClass();
            str.getClass();
            value.valueCase_ = 5;
            value.value_ = str;
        }

        public static void u(Value value, StringSet stringSet) {
            value.getClass();
            value.value_ = stringSet;
            value.valueCase_ = 6;
        }

        public static void v(Value value, double d) {
            value.valueCase_ = 7;
            value.value_ = Double.valueOf(d);
        }

        public static void w(Value value, ByteString byteString) {
            value.getClass();
            value.valueCase_ = 8;
            value.value_ = byteString;
        }

        public static void x(Value value, boolean z2) {
            value.valueCase_ = 1;
            value.value_ = Boolean.valueOf(z2);
        }

        public static void y(Value value, float f) {
            value.valueCase_ = 2;
            value.value_ = Float.valueOf(f);
        }

        public static void z(Value value, int i2) {
            value.valueCase_ = 3;
            value.value_ = Integer.valueOf(i2);
        }

        public final boolean A() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public final ByteString B() {
            return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.f4747Y;
        }

        public final double D() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        public final float E() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        public final int F() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public final long G() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        public final String H() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        public final StringSet I() {
            return this.valueCase_ == 6 ? (StringSet) this.value_ : StringSet.t();
        }

        public final ValueCase J() {
            switch (this.valueCase_) {
                case 0:
                    return ValueCase.j0;
                case 1:
                    return ValueCase.X;
                case 2:
                    return ValueCase.f4720Y;
                case 3:
                    return ValueCase.Z;
                case 4:
                    return ValueCase.e0;
                case 5:
                    return ValueCase.f0;
                case 6:
                    return ValueCase.g0;
                case 7:
                    return ValueCase.h0;
                case 8:
                    return ValueCase.i0;
                default:
                    return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.o(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", StringSet.class});
                case 3:
                    return new Value();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Value> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Value.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface ValueOrBuilder extends MessageLiteOrBuilder {
    }
}
