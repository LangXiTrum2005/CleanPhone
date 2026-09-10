package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class ButtonGroup<T extends Button> {
    private final Array<T> buttons;
    private Array<T> checkedButtons;
    private T lastChecked;
    private int maxCheckCount;
    private int minCheckCount;
    private boolean uncheckLast;

    public ButtonGroup() {
        this.buttons = new Array<>();
        this.checkedButtons = new Array<>(1);
        this.maxCheckCount = 1;
        this.uncheckLast = true;
        this.minCheckCount = 1;
    }

    public void add(T t) {
        if (t == null) {
            throw new IllegalArgumentException("button cannot be null.");
        }
        t.buttonGroup = null;
        boolean z = t.isChecked() || this.buttons.size < this.minCheckCount;
        t.setChecked(false);
        t.buttonGroup = this;
        this.buttons.add(t);
        t.setChecked(z);
    }

    public boolean canCheck(T t, boolean z) {
        if (t.isChecked == z) {
            return false;
        }
        if (z) {
            int i = this.maxCheckCount;
            if (i != -1 && this.checkedButtons.size >= i) {
                if (!this.uncheckLast) {
                    return false;
                }
                int i2 = 0;
                while (true) {
                    int i3 = this.minCheckCount;
                    this.minCheckCount = 0;
                    this.lastChecked.setChecked(false);
                    this.minCheckCount = i3;
                    if (t.isChecked == z) {
                        return false;
                    }
                    if (this.checkedButtons.size >= this.maxCheckCount) {
                        int i4 = i2 + 1;
                        if (i2 > 10) {
                            return false;
                        }
                        i2 = i4;
                    }
                }
            }
            this.checkedButtons.add(t);
            this.lastChecked = t;
        } else {
            Array<T> array = this.checkedButtons;
            if (array.size <= this.minCheckCount) {
                return false;
            }
            array.removeValue(t, true);
        }
        return true;
    }

    public void clear() {
        this.buttons.clear();
        this.checkedButtons.clear();
    }

    public Array<T> getAllChecked() {
        return this.checkedButtons;
    }

    public Array<T> getButtons() {
        return this.buttons;
    }

    @Null
    public T getChecked() {
        Array<T> array = this.checkedButtons;
        if (array.size > 0) {
            return array.get(0);
        }
        return null;
    }

    public int getCheckedIndex() {
        Array<T> array = this.checkedButtons;
        if (array.size > 0) {
            return this.buttons.indexOf(array.get(0), true);
        }
        return -1;
    }

    public void remove(T t) {
        if (t == null) {
            throw new IllegalArgumentException("button cannot be null.");
        }
        t.buttonGroup = null;
        this.buttons.removeValue(t, true);
        this.checkedButtons.removeValue(t, true);
    }

    public void setChecked(String str) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null.");
        }
        int i = this.buttons.size;
        for (int i2 = 0; i2 < i; i2++) {
            T t = this.buttons.get(i2);
            if ((t instanceof TextButton) && str.contentEquals(((TextButton) t).getText())) {
                t.setChecked(true);
                return;
            }
        }
    }

    public void setMaxCheckCount(int i) {
        if (i == 0) {
            i = -1;
        }
        this.maxCheckCount = i;
    }

    public void setMinCheckCount(int i) {
        this.minCheckCount = i;
    }

    public void setUncheckLast(boolean z) {
        this.uncheckLast = z;
    }

    public void uncheckAll() {
        int i = this.minCheckCount;
        this.minCheckCount = 0;
        int i2 = this.buttons.size;
        for (int i3 = 0; i3 < i2; i3++) {
            this.buttons.get(i3).setChecked(false);
        }
        this.minCheckCount = i;
    }

    public void remove(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                remove(t);
            }
            return;
        }
        throw new IllegalArgumentException("buttons cannot be null.");
    }

    public ButtonGroup(T... tArr) {
        this.buttons = new Array<>();
        this.checkedButtons = new Array<>(1);
        this.maxCheckCount = 1;
        this.uncheckLast = true;
        this.minCheckCount = 0;
        add(tArr);
        this.minCheckCount = 1;
    }

    public void add(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                add(t);
            }
            return;
        }
        throw new IllegalArgumentException("buttons cannot be null.");
    }
}
