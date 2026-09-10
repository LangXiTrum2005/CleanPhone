package kotlinx.serialization.json.internal;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/json/internal/rotuma;", "Lfastidiously/attabal;", "Lkotlinx/serialization/json/internal/attabal;", "lexer", "Lcutwater/attabal;", "json", "<init>", "(Lkotlinx/serialization/json/internal/attabal;Lcutwater/attabal;)V", "Lbristol/beachfront;", "descriptor", "", "impassible", "(Lbristol/beachfront;)I", "competently", "()I", "", "apical", "()J", "", "kattegat", "()B", "", "arytenoidectomy", "()S", "attabal", "Lkotlinx/serialization/json/internal/attabal;", "Lcerebral/dern;", "saneness", "Lcerebral/dern;", "()Lcerebral/dern;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rotuma extends fastidiously.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final JsonReader lexer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final cerebral.dern serializersModule;

    public rotuma(JsonReader lexer, cutwater.attabal json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public long apical() {
        JsonReader jsonReader = this.lexer;
        String strMonoploid = jsonReader.monoploid();
        try {
            return p002kotlin.text.oilcan.competently(strMonoploid);
        } catch (IllegalArgumentException unused) {
            JsonReader.rotuma(jsonReader, "Failed to parse type 'ULong' for input '" + strMonoploid + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public short arytenoidectomy() {
        JsonReader jsonReader = this.lexer;
        String strMonoploid = jsonReader.monoploid();
        try {
            return p002kotlin.text.oilcan.cutely(strMonoploid);
        } catch (IllegalArgumentException unused) {
            JsonReader.rotuma(jsonReader, "Failed to parse type 'UShort' for input '" + strMonoploid + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // fastidiously.marial, fastidiously.dern
    /* JADX INFO: renamed from: attabal, reason: from getter */
    public cerebral.dern getSerializersModule() {
        return this.serializersModule;
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public int competently() {
        JsonReader jsonReader = this.lexer;
        String strMonoploid = jsonReader.monoploid();
        try {
            return p002kotlin.text.oilcan.wireman(strMonoploid);
        } catch (IllegalArgumentException unused) {
            JsonReader.rotuma(jsonReader, "Failed to parse type 'UInt' for input '" + strMonoploid + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // fastidiously.dern
    public int impassible(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public byte kattegat() {
        JsonReader jsonReader = this.lexer;
        String strMonoploid = jsonReader.monoploid();
        try {
            return p002kotlin.text.oilcan.attabal(strMonoploid);
        } catch (IllegalArgumentException unused) {
            JsonReader.rotuma(jsonReader, "Failed to parse type 'UByte' for input '" + strMonoploid + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
