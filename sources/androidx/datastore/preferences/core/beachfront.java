package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferencesSerializer.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/datastore/preferences/core/beachfront;", "Landroidx/datastore/core/okio/saneness;", "Landroidx/datastore/preferences/core/dern;", "<init>", "()V", "Lduvetyn/beachfront;", "source", "saneness", "(Lduvetyn/beachfront;Lwretchedly/dern;)Ljava/lang/Object;", "t", "Lduvetyn/marial;", "sink", "", "beachfront", "(Landroidx/datastore/preferences/core/dern;Lduvetyn/marial;Lwretchedly/dern;)Ljava/lang/Object;", "", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "marial", "(Ljava/lang/Object;)Landroidx/datastore/preferences/PreferencesProto$Value;", "", "name", "Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePreferences", "dern", "(Ljava/lang/String;Landroidx/datastore/preferences/PreferencesProto$Value;Landroidx/datastore/preferences/core/MutablePreferences;)V", "wireman", "()Landroidx/datastore/preferences/core/dern;", "defaultValue", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class beachfront implements androidx.datastore.core.okio.saneness<dern> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f9614attabal = new beachfront();

    /* JADX INFO: compiled from: PreferencesSerializer.jvm.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f9615attabal;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f9615attabal = iArr;
        }
    }

    @Override // androidx.datastore.core.okio.saneness
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public Object attabal(dern dernVar, duvetyn.marial marialVar, wretchedly.dern<? super Unit> dernVar2) throws IOException {
        Map<dern.attabal<?>, Object> mapAttabal = dernVar.attabal();
        androidx.datastore.preferences.wireman.attabal attabalVarPeridotite = androidx.datastore.preferences.wireman.peridotite();
        for (Map.Entry<dern.attabal<?>, Object> entry : mapAttabal.entrySet()) {
            attabalVarPeridotite.adultoid(entry.getKey().getName(), marial(entry.getValue()));
        }
        attabalVarPeridotite.build().taiyuan(marialVar.outputStream());
        return Unit.f29295attabal;
    }

    public final void dern(String name, PreferencesProto$Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        PreferencesProto$Value.ValueCase valueCaseItchy = value.itchy();
        switch (valueCaseItchy == null ? -1 : attabal.f9615attabal[valueCaseItchy.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.taiyuan(marial.attabal(name), Boolean.valueOf(value.overspeculate()));
                return;
            case 2:
                mutablePreferences.taiyuan(marial.wireman(name), Float.valueOf(value.cultivated()));
                return;
            case 3:
                mutablePreferences.taiyuan(marial.dern(name), Double.valueOf(value.permissivist()));
                return;
            case 4:
                mutablePreferences.taiyuan(marial.marial(name), Integer.valueOf(value.premeiotic()));
                return;
            case 5:
                mutablePreferences.taiyuan(marial.beachfront(name), Long.valueOf(value.timberyard()));
                return;
            case 6:
                dern.attabal<String> attabalVarCompetently = marial.competently(name);
                String strMilliradian = value.milliradian();
                Intrinsics.checkNotNullExpressionValue(strMilliradian, "value.string");
                mutablePreferences.taiyuan(attabalVarCompetently, strMilliradian);
                return;
            case 7:
                dern.attabal<Set<String>> attabalVarImpromptu = marial.impromptu(name);
                List<String> listWalach = value.treadless().walach();
                Intrinsics.checkNotNullExpressionValue(listWalach, "value.stringSet.stringsList");
                mutablePreferences.taiyuan(attabalVarImpromptu, CollectionsKt.prefect(listWalach));
                return;
            case 8:
                dern.attabal<byte[]> attabalVarSaneness = marial.saneness(name);
                byte[] byteArray = value.clubfoot().toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "value.bytes.toByteArray()");
                mutablePreferences.taiyuan(attabalVarSaneness, byteArray);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    public final PreferencesProto$Value marial(Object value) {
        if (value instanceof Boolean) {
            PreferencesProto$Value preferencesProto$ValueBuild = PreferencesProto$Value.coffeecake().adultoid(((Boolean) value).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild, "newBuilder().setBoolean(value).build()");
            return preferencesProto$ValueBuild;
        }
        if (value instanceof Float) {
            PreferencesProto$Value preferencesProto$ValueBuild2 = PreferencesProto$Value.coffeecake().rotuma(((Number) value).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild2, "newBuilder().setFloat(value).build()");
            return preferencesProto$ValueBuild2;
        }
        if (value instanceof Double) {
            PreferencesProto$Value preferencesProto$ValueBuild3 = PreferencesProto$Value.coffeecake().gintrap(((Number) value).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild3, "newBuilder().setDouble(value).build()");
            return preferencesProto$ValueBuild3;
        }
        if (value instanceof Integer) {
            PreferencesProto$Value preferencesProto$ValueBuild4 = PreferencesProto$Value.coffeecake().preprohormone(((Number) value).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild4, "newBuilder().setInteger(value).build()");
            return preferencesProto$ValueBuild4;
        }
        if (value instanceof Long) {
            PreferencesProto$Value preferencesProto$ValueBuild5 = PreferencesProto$Value.coffeecake().cord(((Number) value).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild5, "newBuilder().setLong(value).build()");
            return preferencesProto$ValueBuild5;
        }
        if (value instanceof String) {
            PreferencesProto$Value preferencesProto$ValueBuild6 = PreferencesProto$Value.coffeecake().cuirassed((String) value).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild6, "newBuilder().setString(value).build()");
            return preferencesProto$ValueBuild6;
        }
        if (value instanceof Set) {
            PreferencesProto$Value.attabal attabalVarCoffeecake = PreferencesProto$Value.coffeecake();
            androidx.datastore.preferences.marial.attabal attabalVarPeridotite = androidx.datastore.preferences.marial.peridotite();
            Intrinsics.competently(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            PreferencesProto$Value preferencesProto$ValueBuild7 = attabalVarCoffeecake.stratoscope(attabalVarPeridotite.adultoid((Set) value)).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild7, "newBuilder().setStringSe…                ).build()");
            return preferencesProto$ValueBuild7;
        }
        if (value instanceof byte[]) {
            PreferencesProto$Value preferencesProto$ValueBuild8 = PreferencesProto$Value.coffeecake().dovishness(ByteString.copyFrom((byte[]) value)).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return preferencesProto$ValueBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // androidx.datastore.core.okio.saneness
    public Object saneness(duvetyn.beachfront beachfrontVar, wretchedly.dern<? super dern> dernVar) throws IOException {
        androidx.datastore.preferences.wireman wiremanVarAttabal = androidx.datastore.preferences.saneness.INSTANCE.attabal(beachfrontVar.inputStream());
        MutablePreferences mutablePreferencesSaneness = wireman.saneness(new dern.saneness[0]);
        Map<String, PreferencesProto$Value> mapStarveling = wiremanVarAttabal.starveling();
        Intrinsics.checkNotNullExpressionValue(mapStarveling, "preferencesProto.preferencesMap");
        for (Map.Entry<String, PreferencesProto$Value> entry : mapStarveling.entrySet()) {
            String name = entry.getKey();
            PreferencesProto$Value value = entry.getValue();
            beachfront beachfrontVar2 = f9614attabal;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            beachfrontVar2.dern(name, value, mutablePreferencesSaneness);
        }
        return mutablePreferencesSaneness.wireman();
    }

    @Override // androidx.datastore.core.okio.saneness
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public dern getDefaultValue() {
        return wireman.attabal();
    }
}
