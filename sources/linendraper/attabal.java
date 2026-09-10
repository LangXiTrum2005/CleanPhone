package linendraper;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import technofreak.dern;

/* JADX INFO: compiled from: Loader.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal<D> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f33052attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Context f33055dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public InterfaceC0723attabal<D> f33058saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f33059wireman = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f33057marial = false;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f33053beachfront = true;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f33054competently = false;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f33056impromptu = false;

    /* JADX INFO: renamed from: linendraper.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Loader.java */
    public interface InterfaceC0723attabal<D> {
    }

    public attabal(Context context) {
        this.f33055dern = context.getApplicationContext();
    }

    public final void apical() {
        this.f33059wireman = true;
        this.f33053beachfront = false;
        this.f33057marial = false;
        impromptu();
    }

    public void attabal() {
        this.f33057marial = true;
        marial();
    }

    public boolean beachfront() {
        return false;
    }

    public void cutely() {
        competently();
        this.f33053beachfront = true;
        this.f33059wireman = false;
        this.f33057marial = false;
        this.f33054competently = false;
        this.f33056impromptu = false;
    }

    public String dern(D d) {
        StringBuilder sb = new StringBuilder(64);
        dern.attabal(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void formularize() {
        this.f33059wireman = false;
        taiyuan();
    }

    public void impassible(InterfaceC0723attabal<D> interfaceC0723attabal) {
        InterfaceC0723attabal<D> interfaceC0723attabal2 = this.f33058saneness;
        if (interfaceC0723attabal2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0723attabal2 != interfaceC0723attabal) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f33058saneness = null;
    }

    public boolean saneness() {
        return beachfront();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        dern.attabal(this, sb);
        sb.append(" id=");
        sb.append(this.f33052attabal);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    public void wireman(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f33052attabal);
        printWriter.print(" mListener=");
        printWriter.println(this.f33058saneness);
        if (this.f33059wireman || this.f33054competently || this.f33056impromptu) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f33059wireman);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f33054competently);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f33056impromptu);
        }
        if (this.f33057marial || this.f33053beachfront) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f33057marial);
            printWriter.print(" mReset=");
            printWriter.println(this.f33053beachfront);
        }
    }

    public void competently() {
    }

    public void impromptu() {
    }

    public void marial() {
    }

    public void taiyuan() {
    }
}
