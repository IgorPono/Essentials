package com.earth2me.essentials;
import net.ess3.api.TranslatableException; // Issue stems from exceptions not being universally translatable
public class ChargeException extends TranslatableException {
    public ChargeException(final String message) {
        super(message);
    }

    public ChargeException(final String message, final Object... throwable) {
        super(message, throwable);
    }
}
