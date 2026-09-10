package uniterm;

import com.google.firebase.encoders.EncodingException;
import derbyshire.competently;
import java.io.IOException;

/* JADX INFO: compiled from: ProtobufValueEncoderContext.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront implements competently {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public derbyshire.dern f39231dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final com.google.firebase.encoders.proto.saneness f39233wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f39230attabal = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f39232saneness = false;

    public beachfront(com.google.firebase.encoders.proto.saneness sanenessVar) {
        this.f39233wireman = sanenessVar;
    }

    @Override // derbyshire.competently
    public competently attabal(String str) throws IOException {
        saneness();
        this.f39233wireman.kowloon(this.f39231dern, str, this.f39232saneness);
        return this;
    }

    @Override // derbyshire.competently
    public competently competently(boolean z) throws IOException {
        saneness();
        this.f39233wireman.formularize(this.f39231dern, z, this.f39232saneness);
        return this;
    }

    public void dern(derbyshire.dern dernVar, boolean z) {
        this.f39230attabal = false;
        this.f39231dern = dernVar;
        this.f39232saneness = z;
    }

    public final void saneness() {
        if (this.f39230attabal) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f39230attabal = true;
    }
}
