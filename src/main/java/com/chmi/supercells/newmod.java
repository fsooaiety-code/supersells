package com.Momo.mod.storage;

import appeng.items.storage.StorageCellTier;

public class SuperCellTier implements StorageCellTier {

    @Override
    public int getBytes() {
        return 500_000_000; // 500M байт
    }

    @Override
    public int getTypes() {
        return 500; // 500 типов предметов
    }

    @Override
    public double getIdleDrain() {
        return 20.0; // потребление энергии
    }
}