package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R*\u00100\u001a\u00020&2\u0006\u0010)\u001a\u00020&8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b+\u0010.\"\u0004\b/\u0010(¨\u00061"}, d2 = {"Lkotlinx/serialization/json/internal/triweekly;", "", "Lkotlinx/serialization/json/internal/gintrap;", "writer", "<init>", "(Lkotlinx/serialization/json/internal/gintrap;)V", "", "saneness", "()V", "monoploid", "dern", "wireman", "arytenoidectomy", "", "v", "beachfront", "(C)V", "", "apical", "(Ljava/lang/String;)V", "", "impromptu", "(F)V", "", "competently", "(D)V", "", "marial", "(B)V", "", "formularize", "(S)V", "", "taiyuan", "(I)V", "", "cutely", "(J)V", "", "impassible", "(Z)V", "value", "triweekly", "attabal", "Lkotlinx/serialization/json/internal/gintrap;", "Z", "()Z", "kowloon", "writingFirst", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final gintrap writer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean writingFirst;

    public triweekly(gintrap writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
        this.writingFirst = true;
    }

    public final void apical(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.writer.dern(v);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public final void beachfront(char v) {
        this.writer.attabal(v);
    }

    public void competently(double v) {
        this.writer.dern(String.valueOf(v));
    }

    public void cutely(long v) {
        this.writer.writeLong(v);
    }

    public void dern() {
        this.writingFirst = false;
    }

    public void formularize(short v) {
        this.writer.writeLong(v);
    }

    public void impassible(boolean v) {
        this.writer.dern(String.valueOf(v));
    }

    public void impromptu(float v) {
        this.writer.dern(String.valueOf(v));
    }

    public final void kowloon(boolean z) {
        this.writingFirst = z;
    }

    public void marial(byte v) {
        this.writer.writeLong(v);
    }

    public void saneness() {
        this.writingFirst = true;
    }

    public void taiyuan(int v) {
        this.writer.writeLong(v);
    }

    public void triweekly(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.writer.saneness(value);
    }

    public void wireman() {
        this.writingFirst = false;
    }

    public void arytenoidectomy() {
    }

    public void monoploid() {
    }
}
