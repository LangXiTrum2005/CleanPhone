package basify;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: EmojiKeyListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements KeyListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final KeyListener f14952attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f14953saneness;

    /* JADX INFO: compiled from: EmojiKeyListener.java */
    public static class attabal {
        public boolean attabal(Editable editable, int i, KeyEvent keyEvent) {
            return androidx.emoji2.text.dern.competently(editable, i, keyEvent);
        }
    }

    public marial(KeyListener keyListener) {
        this(keyListener, new attabal());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f14952attabal.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f14952attabal.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f14953saneness.attabal(editable, i, keyEvent) || this.f14952attabal.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f14952attabal.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f14952attabal.onKeyUp(view, editable, i, keyEvent);
    }

    public marial(KeyListener keyListener, attabal attabalVar) {
        this.f14952attabal = keyListener;
        this.f14953saneness = attabalVar;
    }
}
