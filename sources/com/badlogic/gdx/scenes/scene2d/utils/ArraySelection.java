package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.OrderedSet;

/* JADX INFO: loaded from: classes.dex */
public class ArraySelection<T> extends Selection<T> {
    private Array<T> array;
    private boolean rangeSelect = true;
    private T rangeStart;

    public ArraySelection(Array<T> array) {
        this.array = array;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Selection
    public void changed() {
        this.rangeStart = null;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Selection
    public void choose(T t) {
        if (t == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        if (this.isDisabled) {
            return;
        }
        if (!this.rangeSelect || !this.multiple) {
            super.choose(t);
            return;
        }
        if (this.selected.size > 0 && UIUtils.shift()) {
            T t2 = this.rangeStart;
            int iIndexOf = t2 == null ? -1 : this.array.indexOf(t2, false);
            if (iIndexOf != -1) {
                T t3 = this.rangeStart;
                snapshot();
                int iIndexOf2 = this.array.indexOf(t, false);
                if (iIndexOf > iIndexOf2) {
                    int i = iIndexOf;
                    iIndexOf = iIndexOf2;
                    iIndexOf2 = i;
                }
                if (!UIUtils.ctrl()) {
                    this.selected.clear(8);
                }
                while (iIndexOf <= iIndexOf2) {
                    this.selected.add(this.array.get(iIndexOf));
                    iIndexOf++;
                }
                if (fireChangeEvent()) {
                    revert();
                } else {
                    changed();
                }
                this.rangeStart = t3;
                cleanup();
                return;
            }
        }
        super.choose(t);
        this.rangeStart = t;
    }

    public boolean getRangeSelect() {
        return this.rangeSelect;
    }

    public void setRangeSelect(boolean z) {
        this.rangeSelect = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void validate() {
        Array<T> array = this.array;
        if (array.size == 0) {
            clear();
            return;
        }
        OrderedSet.OrderedSetIterator<T> it = items().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!array.contains(it.next(), false)) {
                it.remove();
                z = true;
            }
        }
        if (this.required && this.selected.size == 0) {
            set(array.first());
        } else if (z) {
            changed();
        }
    }
}
