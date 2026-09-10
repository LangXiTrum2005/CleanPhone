package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiEditTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HelperInternal19 f5022a;

    public static class HelperInternal {
    }

    public static class HelperInternal19 extends HelperInternal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f5023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmojiTextWatcher f5024b;

        public HelperInternal19(EditText editText) {
            this.f5023a = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText);
            this.f5024b = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            if (EmojiEditableFactory.f5026b == null) {
                synchronized (EmojiEditableFactory.f5025a) {
                    try {
                        if (EmojiEditableFactory.f5026b == null) {
                            EmojiEditableFactory emojiEditableFactory = new EmojiEditableFactory();
                            try {
                                EmojiEditableFactory.f5027c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            EmojiEditableFactory.f5026b = emojiEditableFactory;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            editText.setEditableFactory(EmojiEditableFactory.f5026b);
        }
    }

    public EmojiEditTextHelper(EditText editText) {
        this.f5022a = new HelperInternal19(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        this.f5022a.getClass();
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    public final InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        HelperInternal19 helperInternal19 = this.f5022a;
        helperInternal19.getClass();
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(helperInternal19.f5023a, inputConnection, editorInfo);
    }

    public final void c(boolean z2) {
        EmojiTextWatcher emojiTextWatcher = this.f5022a.f5024b;
        if (emojiTextWatcher.Z != z2) {
            if (emojiTextWatcher.f5040Y != null) {
                EmojiCompat emojiCompatA = EmojiCompat.a();
                EmojiCompat.InitCallback initCallback = emojiTextWatcher.f5040Y;
                emojiCompatA.getClass();
                Preconditions.d(initCallback, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = emojiCompatA.f4962a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    emojiCompatA.f4963b.remove(initCallback);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            emojiTextWatcher.Z = z2;
            if (z2) {
                EmojiTextWatcher.a(emojiTextWatcher.X, EmojiCompat.a().b());
            }
        }
    }
}
