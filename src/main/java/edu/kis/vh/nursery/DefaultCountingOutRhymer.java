package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer implementuje prosty stos liczbowy
 * z ograniczoną wielkością oraz operacjami dodawania, podglądu i usuwania.
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY;

    /**
     * Dodaje wartość na stos, jeśli nie jest on pełny.
     *
     * @param in wartość do dodania na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true jeśli stos jest pusty, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true jeśli stos jest pełny, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Zwraca aktualną liczbę elementów na stosie.
     *
     * @return indeks ostatniego elementu (lub -1 jeśli pusty)
     */
    protected int getTotal() {
        return total;
    }

    /**
     * Zwraca ostatnio dodaną wartość bez jej usuwania (podgląd).
     *
     * @return ostatnia wartość na stosie lub -1 jeśli pusty
     */
    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca ostatnio dodaną wartość ze stosu.
     *
     * @return usunięta wartość lub -1 jeśli pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}
