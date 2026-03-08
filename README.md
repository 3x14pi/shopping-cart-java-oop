# Shopping Cart (Java OOP)

Java project for managing a shopping cart with multiple product types, quantity merging, discounts, totals, and customizable sorting.

## Assignment / Problem Statement

Implement an object-oriented shopping cart system that supports:

- regular products,
- discounted products (percentage discount and 3x2 discount),
- automatic quantity aggregation for identical products,
- computation of net total and gross total,
- extraction of discounted/non-discounted product lists,
- sorting by natural order and by custom comparator.

## Project Goal

Model a realistic cart workflow where products can have different pricing rules while preserving a clean OOP design based on inheritance and polymorphism.

## Implemented Features

- Add product to cart:
  - if same name and same unit price already exists, quantities are merged,
  - otherwise product is added as a new entry.
- Cost calculations:
  - `totale()` -> total with discounts,
  - `totaleLordo()` -> total without discounts.
- Product filters:
  - `prodottiScontati()`
  - `prodottiNonScontati()`
- Sorting:
  - natural product ordering (`Comparable<Prodotto>`),
  - custom descending unit-price ordering (`Comparator<Prodotto>`).

## Class Structure

- `Prodotto.java`  
  Base class (`nome`, `prezzo`, `quantita`), cost and natural ordering.
- `ProdottoScontatoPerc.java`  
  Percentage-discount product.
- `ProdottoScontato3x2.java`  
  3x2 discount product.
- `Carrello.java`  
  Core cart class: add, totals, filtering, sorting, print.
- `PrezzoException.java`  
  Runtime exception for invalid price.
- `QuantitaException.java`  
  Runtime exception for invalid quantity.
- `ScontoException.java`  
  Runtime exception for invalid discount percentage.
- `Esercizio1.java`  
  Functional test: add products, print totals, print filtered lists.
- `Esercizio2.java`  
  Sorting test: natural order + descending price order.


## Discount Rules

### Percentage Discount

For `ProdottoScontatoPerc`:

```math
cost = baseCost \cdot (100 - discount) / 100
```

### 3x2 Discount

For `ProdottoScontato3x2`:

- every 3 items, 1 is free,
- remaining items are paid at full price.

## Build

```bash
javac *.java
```

## Run

### Exercise 1

```bash
java Esercizio1
```

Shows:

- full cart content,
- total with discounts,
- gross total,
- discounted vs non-discounted lists.

### Exercise 2

```bash
java Esercizio2
```

Shows:

- cart sorted by natural order,
- cart sorted by descending unit price.

## Sample Output Highlights

From current execution:

- `TOTALE: 126.0`
- `TOTALE LORDO: 156.1`

This confirms discount logic is active and gross/net totals differ as expected.

## Design Choices

- Inheritance for discount variants (`Prodotto` -> specialized discounted products).
- Polymorphic `costo()` for pricing behavior.
- Encapsulated cart logic in `Carrello`.
- Runtime exceptions for invalid input constraints.

## Possible Improvements

- Add unit tests (JUnit) for each pricing rule.
- Override `hashCode()` where `equals()` is overridden.
- Improve floating-point comparison for prices (`BigDecimal` or epsilon checks).
- Add input parsing and CLI interaction for dynamic cart creation.

## Author

Antonio Ferri
