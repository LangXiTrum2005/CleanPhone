package androidx.media3.extractor.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessageEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f6917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f6918b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f6917a = byteArrayOutputStream;
        this.f6918b = new DataOutputStream(byteArrayOutputStream);
    }
}
