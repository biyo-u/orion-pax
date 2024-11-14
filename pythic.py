'''
omg im doing python now (im so slayed and hunty)

'''
import time

print('Welcome to the Apple Store Database!')
time.sleep(.5)

productName = input('Please, what is the name of the product?')

productCost = input('Nice, and how much does ' + productName + " cost?")

manufacturer = input('Thanks, now which manufacturer produced ' + productName + " ?")

print('Product: ' + manufacturer + ' ' + productName + ', costing ' + productCost)

stockNumber = input('Excellent! So, what is the number of stock recieved?')
print(stockNumber)

productCost = int(productCost)
tax = productCost * 1.05
tax = str(tax)

print('The new product is ' + productName)
print('Plus tax, the cost comes to $' + tax)
print('The shipment included ' + stockNumber + ' from ' + manufacturer)