# ZAPANTA JOHN LLOYD B.
# BSCS 2-Y1-1
# PLNG211

# Activity #1:
# We have 6 products and we know their prices in USD$.
# We want to convert the prices to Euros

usd_prices = [10.99, 25.50, 5.00, 120.00, 45.75, 89.99]
exchange_rate = 0.866
eur_prices = [round(price * exchange_rate, 2) for price in usd_prices]

print("Prices in USD: ", usd_prices)
print("Prices in Euros:", eur_prices)