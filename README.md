# Advanced Calculator with Shunting Yard Algorithm
Java calculator implementing **Shunting Yard Algorithm** for complex mathematical expression parsing and evaluation. Features postfix evaluation, operator precedence handling and clean Swing GUI with test coverage.


## Key Features

- **Dual Calculator Modes**: Basic calculator and advanced expression evaluator
- **Shunting Yard Algorithm**: Converts infix notation to postfix (Reverse Polish Notation)
- **PostFix Expression Evaluation**: Efficient stack-based evaluation
- **Advanced Mathematical Operations**: 
  - Basic arithmetic (`+`, `-`, `×`, `÷`)
  - Exponentiation (`^`) with right-associativity
  - Square root (`√`) and natural logarithm (`ln`)
  - Parentheses grouping with unlimited nesting depth
- **Intuitive GUI**: Clean Swing interface with keyboard and mouse input support
- **Comprehensive Testing Suite**: Unit tests for all core algorithms

## Core Components

- **`PostFixEvaluator`**: Stack-based engine for evaluating postfix expressions
- **`ShuntingYard`**: Implementation of Dijkstra's algorithm for infix-to-postfix conversion
- **`Token`**: Polymorphic representation of numbers, operators, and functions
- **`CalcPanel`**: Basic calculator with immediate evaluation
- **`ShuntingCalcPanel`**: Advanced calculator supporting complex expressions

## Technical Implementation

### Shunting Yard Algorithm
Converts infix expressions like `3 + 4 * 2 / (1 - 5)^2` to postfix notation for efficient evaluation.

### PostFix Evaluation
Evaluates postfix expressions using a stack-based approach with O(n) time complexity.

## Supported Operations

| Operation | Symbol | Precedence | Associativity |
|-----------|---------|------------|---------------|
| Addition | `+` | 1 | Left |
| Subtraction | `-` | 1 | Left |
| Multiplication | `×`, `*` | 2 | Left |
| Division | `÷`, `/` | 2 | Left |
| Exponentiation | `^` | 3 | Right |
| Square Root | `√` | Function | N/A |
| Natural Log | `ln` | Function | N/A |

## Getting Started

### Prerequisites
- Java JDK 8 or higher

### Installation & Usage
```bash
# Clone the repository
git clone https://github.com/enkhemm/advanced-expression-calculator.git
cd advanced-expression-calculator

# Compile
javac *.java

# Run
java Main
```

### Using the Calculator
1. **Basic Mode**: Standard calculator with immediate evaluation
2. **Shunting Yard Mode**: Enter complex expressions like `(3+4)*2^3` and press `=`
3. **Testing**: Use the menu to run ready tests

## Testing

The project includes a custom testing framework:
- PostFix evaluation tests
- Shunting Yard conversion tests  

Run tests via the GUI menu: `Tests → PostFix` or `Tests → Shunting Yard`

## Performance

- **Time Complexity**: O(n) for both parsing and evaluation
- **Space Complexity**: O(n) for token storage and operator stack
- **Expression Depth**: Unlimited parentheses nesting supported

## Technologies Used

- Java
- Swing GUI
- Object-Oriented Design
- Data Structures & Algorithms
- Custom Testing Framework
